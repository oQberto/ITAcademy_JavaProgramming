package by.itacademy.additionalTasks.stack;

import java.util.LinkedList;
import java.util.List;

public class Stack {
    private final List<Integer> integersStack = new LinkedList<>();
    public int maxInStack = Integer.MIN_VALUE;

    public void push(int number) {
        max(number);
        integersStack.add(0, number);
    }

    public int pop() {
        return integersStack.remove(0);
    }

    public void max(int newMax) {
        if (newMax > maxInStack) {
            maxInStack = newMax;
        }
    }

    public boolean isEmpty() {
        return integersStack.isEmpty();
    }
}