package by.itacademy.additionalTasks.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static String replaceABC(String str) {
        if (str.startsWith("abc")) {
            return str.replace("abc", "www");
        } else {
            return str + "zzz";
        }
    }

    public static String removeSpaces(String str) {
        return str.replaceAll("\\s+", " ").trim();
    }

    public static String getLongestRowOfNumbers(String str) {
        Pattern pattern  = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        String longestRowStr = "";
        int longestRow = Integer.MIN_VALUE;
        int temp;

        while (matcher.find()) {
            temp = matcher.group().length();
            if (temp > longestRow) {
                longestRow = temp;
                longestRowStr = matcher.group();
            }
        }
        return "Longest row: " + longestRow + " -> " + longestRowStr;
    }

    public static int findPunctuationMarks(String str) {
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(str);
        int count = 0;

        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static int countUniqueWords(String str) {
        String[] words = (str + " ").split("\\p{P}? +");
        int count = words.length;

        for (int i = 1; i < words.length; i++) {
            for (int j = 0; j < i; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    public static StringBuffer getHexColor(String str) {
        StringBuffer hexColors = new StringBuffer("Hex colors: \n");
        Pattern pattern = Pattern.compile("#?([A-F\\d]){3,6}");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            hexColors.append(matcher.group()).append("\n");
        }
        return hexColors;
    }
}
