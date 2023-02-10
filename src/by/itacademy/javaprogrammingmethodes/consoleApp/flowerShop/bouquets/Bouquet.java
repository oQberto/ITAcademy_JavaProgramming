package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.bouquets;

import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.flower.FlowerName;

public class Bouquet {
    private final FlowerName[] flowersNames;
    private final BouquetType bouquetType;
    public int bouquetPrice;

    public Bouquet(FlowerName[] flowersNames, BouquetType bouquetType) {
        this.flowersNames = flowersNames;
        this.bouquetType = bouquetType;
    }

    public FlowerName[] getFlowersNames() {
        return flowersNames;
    }

    public BouquetType getBouquetType() {
        return bouquetType;
    }

    public int getBouquetPrice() {
        return bouquetPrice;
    }

    public void setBouquetPrice(int bouquetPrice) {
        this.bouquetPrice = bouquetPrice;
    }
}
