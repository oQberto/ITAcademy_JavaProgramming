package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.flower;

import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.Plant;

public class Flower extends Plant implements Comparable<Flower> {
    private final FlowerName flowerName;
    private final FlowerColor flowerColor;

    public Flower(int plantId, int plantPrice, int flowerStemHeight, int freshnessLevel,
                  FlowerName flowerName, FlowerColor flowerColor) {
        super(plantId, plantPrice, flowerStemHeight, freshnessLevel);
        this.flowerName = flowerName;
        this.flowerColor = flowerColor;
    }

    @Override
    public void grow() {
        plantHeight += 5;
    }

    @Override
    public int compareTo(Flower f) {
        return this.freshnessLevel - f.freshnessLevel;
    }

    public FlowerName getFlowerName() {
        return flowerName;
    }

    public FlowerColor getFlowerColor() {
        return flowerColor;
    }
}
