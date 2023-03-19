package by.itacademy.homework6;

import by.itacademy.homework6.countries.Country;
import by.itacademy.homework6.factory.Factory;
import by.itacademy.homework6.factory.FactoryStock;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        FactoryStock factoryStock = new FactoryStock();
        Factory FACTORY = new Factory(factoryStock);
        Country USA = new Country(FACTORY, "USA");
        Country CHINA = new Country(FACTORY, "China");
        Country RUSSIA = new Country(FACTORY, "Russia");

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
