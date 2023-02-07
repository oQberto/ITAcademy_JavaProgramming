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
}
