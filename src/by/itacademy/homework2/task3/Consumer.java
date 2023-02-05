package by.itacademy.homework2.task3;

public class Consumer {
    private final int[] consumers = new int[5];
    private int count = 0;
    public void consume(int value) {
        if (count == 5) {
            count = 0;
        }
        consumers[count] = value;
        count++;
    }

    public double getAverage() {
        double sum = 0.0;
        int count = 0;
        for (int value : consumers) {
            if (value == 0) {
                continue;
            }
            sum += value;
            count++;
        }
        return sum / count;
    }
}
