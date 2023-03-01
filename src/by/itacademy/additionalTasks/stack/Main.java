package by.itacademy.additionalTasks.stack;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Random random = new Random();
        int randomNum;

        System.out.print("First in: ");
        for (int i = 0; i < 10; i++) {
            randomNum = random.nextInt(100);
            System.out.print(randomNum + " ");
            stack.push(randomNum);
        }
        System.out.println("\nMax in stack: " + stack.getMax());

        System.out.println("\nDeleted values: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\nMax in stack: " + stack.getMax());

        System.out.print("\nLast out: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\nMax in stack: " + stack.getMax());
    }
}
