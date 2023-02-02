package by.itacademy.homework2.task3;

import java.util.Arrays;

public class Consumer {
    private static final int[] CONSUMERS = new int[5];
    private static int count = 0;

    public static void consume(int consumer) {
        if (count == 5) {
            count = 0;
        }
        CONSUMERS[count] = consumer;
        count++;
    }

    public static double getAverage() {
        return Arrays.stream(CONSUMERS).average().orElse(Double.NaN);
    }
}
