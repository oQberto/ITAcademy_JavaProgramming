package by.itacademy.workbook.collections.ex40;

import java.util.List;
import java.util.Random;

public class StudentMarks {

    public void fillList(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(i, random.nextInt(1, 11));
        }
    }

    public void showList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    public void removeBadMarks(List<Integer> list) {
        list.removeIf(integer -> integer < 4);
    }
}
