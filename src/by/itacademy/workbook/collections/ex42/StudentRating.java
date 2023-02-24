package by.itacademy.workbook.collections.ex42;

import java.util.Iterator;
import java.util.List;

public class StudentRating {

    public int findMaxMark(List<Integer> list) {
        Iterator<Integer> listIterator = list.listIterator();
        int maxMark = Integer.MIN_VALUE;
        while (listIterator.hasNext()) {
            if (listIterator.next() > maxMark) {
                maxMark = listIterator.next();
            }
        }
        return maxMark;
    }
}
