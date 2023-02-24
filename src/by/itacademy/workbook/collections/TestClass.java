package by.itacademy.workbook.collections;

import by.itacademy.workbook.collections.ex40.StudentMarks;
import by.itacademy.workbook.collections.ex41.Repeat;
import by.itacademy.workbook.collections.ex42.StudentRating;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    static StudentMarks studentMarks = new StudentMarks();
    static Repeat repeat = new Repeat();
    static StudentRating studentRating = new StudentRating();
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        studentMarks.fillList(list);
        studentMarks.showList(list);
        System.out.println();
        System.out.println(studentRating.findMaxMark(list));

    }
}
