package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.bouquets;

import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.flower.Flower;

public class Bouquet {
    private final BouquetType bouquetType;
    private final int bouquetCapacity;
    protected Flower[] flowers;
    private int bouquetPrice;


    public Bouquet(BouquetType bouquetType, Flower[] flowers) {
        this.bouquetType = bouquetType;
        this.flowers = flowers;
        this.bouquetCapacity = bouquetType.getBouquetCapacity();
        this.bouquetPrice = bouquetType.getPrice();
    }

    public BouquetType getBouquetType() {
        return bouquetType;
    }

    public int getBouquetCapacity() {
        return bouquetCapacity;
    }

    public int getBouquetPrice() {
        return bouquetPrice;
    }

    public void setBouquetPrice(int bouquetPrice) {
        this.bouquetPrice = bouquetPrice;
    }
}
