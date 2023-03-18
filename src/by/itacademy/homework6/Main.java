package by.itacademy.homework6;

import by.itacademy.homework6.countries.Country;
import by.itacademy.homework6.factory.Factory;
import by.itacademy.homework6.factory.FactoryStock;

public class Main {
    private static final FactoryStock factoryStock = new FactoryStock();
    private static final Factory FACTORY = new Factory(factoryStock);
    private static final Country country1 = new Country(factoryStock, FACTORY, "USA");
    private static final Country country2 = new Country(factoryStock, FACTORY, "China");
    private static final Country country3 = new Country(factoryStock, FACTORY, "Russia");

    public static void main(String[] args) throws InterruptedException {
        Thread factory = new Thread(FACTORY);
        Thread country_1 = new Thread(country1);
        Thread country_2 = new Thread(country2);
        Thread country_3 = new Thread(country3);

        factory.start();
        country_1.start();
        country_2.start();
        country_3.start();

        factory.join();
        country_1.join();
        country_2.join();
        country_3.join();

    }
}
