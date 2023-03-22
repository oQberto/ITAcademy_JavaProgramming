package by.itacademy.homework6.usingsemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(1, false);
        Stock factoryStock = new Stock();
        Factory FACTORY = new Factory(semaphore, factoryStock);

        ExecutorService executorService
                = Executors.newFixedThreadPool(5);
        executorService.execute(FACTORY);
        executorService.execute(new Country(semaphore, FACTORY, "USA"));
        executorService.execute(new Country(semaphore, FACTORY, "China"));
        executorService.execute(new Country(semaphore, FACTORY, "Russia"));
        executorService.execute(new Country(semaphore, FACTORY, "Poland"));
        executorService.shutdown();
    }
}
