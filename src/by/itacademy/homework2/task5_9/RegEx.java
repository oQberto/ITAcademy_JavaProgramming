package by.itacademy.homework2.task5_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    private static Pattern pattern;
    private static Matcher matcher;
    public static int countWords(String text) {
        pattern = Pattern.compile("\\b([^cC ]*[cC][^cC ]*){3}\\b");
        matcher = pattern.matcher(text);
        int words = 0;

        while (matcher.find()) {
            words++;
        }
        return words;
    }

    public static String getLongestWord(String text) {
        pattern = Pattern.compile("\\b\\w+\\b");
        matcher = pattern.matcher(text);

        String longestWord = "";
        int lengthOfLongestWord = Integer.MIN_VALUE;
        int temp;

        while (matcher.find()) {
            temp = matcher.end() - matcher.start();
            if (temp > lengthOfLongestWord) {
                longestWord = matcher.group();
                lengthOfLongestWord = temp;
            }
        }
        return longestWord;
    }

    public static StringBuffer showWordsThatStartAndEndWithA(String text) {
        pattern = Pattern.compile("\\ba\\w*a\\b");
        matcher = pattern.matcher(text);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            result.append(matcher.group()).append(" ");
        }
        return result;
    }

    public static StringBuffer getCreditCardNumber(String text) {
        pattern = Pattern.compile("\\d[0-9]{3}(-[0-9]{4}){3}");
        matcher = pattern.matcher(text);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            result.append(matcher.group()).append("\n");
        }
        return result;
    }
}
