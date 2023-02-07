package by.itacademy.additionalTasks.regex;

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
}
