package by.itacademy.additionalTasks.stack;

import java.util.LinkedList;
import java.util.List;

public class Stack {
    public final List<Integer> integersStack = new LinkedList<>();
    private final List<Integer> maxFromStack = new LinkedList<>();

    public void push(int number) {
        maxFromStack.add(findMax(number));
        integersStack.add(0, number);
    }

    public int peek(List<Integer> integers) {
        return integers.get(integers.size() - 1);
    }

    public int pop() {
        maxFromStack.remove(maxFromStack.size() - 1);
        return integersStack.remove(0);
    }

    public Integer getMax() {
        if (integersStack.isEmpty()) {
            return null;
        }
        return maxFromStack.get(maxFromStack.size() - 1);
    }

    public boolean isEmpty() {
        return integersStack.isEmpty();
    }

    private int findMax(int number) {
        int max = number;
        if (!maxFromStack.isEmpty() && max < peek(maxFromStack)) {
            max = peek(maxFromStack);
        }
        return max;
    }

}