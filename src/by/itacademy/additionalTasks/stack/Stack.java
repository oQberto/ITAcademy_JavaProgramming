package by.itacademy.additionalTasks.stack;

import java.util.LinkedList;
import java.util.List;

public class Stack {
    private final List<Integer> integersStack = new LinkedList<>();
    private final List<Integer> maxFromStack = new LinkedList<>();

    public void push(int number) {
        pushToMax(number);
        integersStack.add(0, number);
    }

    public int peek(List<Integer> integers) {
        return integers.get(integers.size() - 1);
    }

    public int pop() {
        int temp = integersStack.remove(0);
        if (temp == peek(maxFromStack)) {
            maxFromStack.remove(maxFromStack.size() - 1);
        }
        return temp;
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

    private void pushToMax(int number) {
        if (!maxFromStack.isEmpty() && number < peek(maxFromStack)) {
            return;
        }
        maxFromStack.add(number);
    }
}