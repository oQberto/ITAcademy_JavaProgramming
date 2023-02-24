package by.itacademy.workbook.collections.ex41;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Repeat {

    public void removeRepeats(List<Integer> list) {
        Set<Integer> setList = new HashSet<>(list);
        list.clear();
        list.addAll(setList);
    }
}