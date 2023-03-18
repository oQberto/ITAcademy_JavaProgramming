package by.itacademy.homework6;

import by.itacademy.homework6.countries.Country;
import by.itacademy.homework6.factory.Factory;
import by.itacademy.homework6.factory.FactoryStock;

public class Main {
    private static final FactoryStock factoryStock = new FactoryStock();
    private static final Factory FACTORY = new Factory(factoryStock);
    private static final Country USA = new Country(factoryStock, FACTORY, "USA");
    private static final Country CHINA = new Country(factoryStock, FACTORY, "China");
    private static final Country RUSSIA = new Country(factoryStock, FACTORY, "Russia");

    public static void main(String[] args) throws InterruptedException {
        Thread factory = new Thread(FACTORY);
        Thread usaThread = new Thread(USA);
        Thread chinaThread = new Thread(CHINA);
        Thread russiaThread = new Thread(RUSSIA);

        factory.start();
        usaThread.start();
        chinaThread.start();
        russiaThread.start();

        factory.join();
        usaThread.join();
        chinaThread.join();
        russiaThread.join();

    }
}
