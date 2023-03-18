import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    private static final Integer LIMIT = 12;
    private static final BlockingQueue<Integer> BUFFER = new LinkedBlockingQueue<>();
    private static volatile boolean consumer = true;
    private static volatile boolean producer = true;

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        Thread producer = new Thread(main::producer);
        Thread consumer = new Thread(main::consumer);
        Thread consumer1 = new Thread(main::consumer);

        producer.start();
        consumer.start();
        consumer1.start();

        producer.join();
        consumer.join();
        consumer1.join();
    }

    private void producer() {
        try {
            int value = 0;
            while (producer) {
                synchronized (BUFFER) {
                    while (BUFFER.size() == LIMIT) {
                        BUFFER.wait();
                    }
                    Thread.sleep(500);
                    System.out.println(" Produced: " + ++value);
                    BUFFER.add(value);
                    if (value == 30) {
                        producer = false;
                    }
                BUFFER.notify();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void consumer() {
        try {
            while (consumer) {
                synchronized (BUFFER) {
                    while (BUFFER.size() == 0) {
                        BUFFER.wait();
                    }
                    Thread.sleep(500);
                    Integer value = BUFFER.poll();
                    System.out.println(Thread.currentThread().getName() + " Consumed: " + value);
                    if (value != null && value == 30) {
                        consumer = false;
                    }
                BUFFER.notify();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}