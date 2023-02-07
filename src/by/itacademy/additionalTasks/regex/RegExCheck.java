package by.itacademy.additionalTasks.regex;

public class RegExCheck {
    public static void main(String[] args) {
        System.out.println(RegEx.countUniqueWords("Listen to the news from today and read the text at the same time." +
                " Listen to the news from today without reading the text."));
        System.out.println(RegEx.countUniqueWords("например например. например слово"));
    }
}
