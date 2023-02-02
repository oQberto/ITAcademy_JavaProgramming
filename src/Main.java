import by.itacademy.homework2.task3.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer.consume(1);
        Consumer.consume(1);
        Consumer.consume(4);
        Consumer.consume(3);
        Consumer.consume(1);
        Consumer.consume(4);
        Consumer.consume(6);

        System.out.println(Consumer.getAverage());
    }
}