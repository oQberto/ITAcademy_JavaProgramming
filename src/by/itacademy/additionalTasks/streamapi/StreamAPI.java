package by.itacademy.additionalTasks.streamapi;

import java.util.*;

/*
    Дана коллекция Collection<String> col. С помощью stream api:
+ узнать, содержит ли какая-нибудь из строк слово login
+ найти самую длинную строку
+ найти самую короткую строку
+ найти строки-слова (не содержат пробелов и знаков препинания)
+ получить все слова используемые в строках
 */
public class StreamAPI {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("In general computer usage, login is the procedure used to get access to an operating ");
        stringList.add("system or application, usually in a remote computer.");
        stringList.add("Almost always a login requires that the user have (1) a user ID and (2) a password.");
        stringList.add("Often, the user ID must conform to a limited length such as eight characters and the password ");
        stringList.add("must contain at least one digit and not match a natural language word.");
        stringList.add("The user ID can be freely known and is visible when entered at a keyboard or other input device.");
        stringList.add("The password must be kept secret (and is not displayed as it is entered).");
        stringList.add("Some Web sites require users to register in order to use the site; registered ");
        stringList.add("users can then enter the site by logging on.");
        stringList.add("word");
        stringList.add("word-word");

        //узнать, содержит ли какая-нибудь из строк слово login
        stringList.stream().filter(s -> s.contains("login")).forEach(System.out::println);
        System.out.println();
        //найти самую длинную строку
        System.out.println(stringList.stream().max(Comparator.comparingInt(String::length)).get());
        System.out.println();
        //найти самую короткую строку
        System.out.println(stringList.stream().min(Comparator.comparingInt(String::length)).get());
        System.out.println();
        //найти строки-слова (не содержат пробелов и знаков препинания)
        stringList.stream().filter(s -> s.matches("[a-zA-Z]*-?[a-zA-Z]*")).forEach(System.out::println);
        System.out.println();
        //получить все слова используемые в строках
        stringList.forEach(s -> Arrays.stream(s.split("\\s+")).forEach(System.out::println));
    }
}
