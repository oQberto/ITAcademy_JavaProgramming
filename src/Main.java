import by.itacademy.homework2.task3.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        consumer.consume(3);
        consumer.consume(2);
        consumer.consume(5);
        consumer.consume(5);
        consumer.consume(3);
        consumer.consume(5);
        consumer.consume(5);
        consumer.consume(10);
        consumer.consume(10);
        consumer.consume(0);
        consumer.consume(0);
        consumer.consume(0);
        consumer.consume(0);
        System.out.println(consumer.getAverage());
    }
}