package by.itacademy.javaProgrammingMethodes.consoleApp.flowerShop.plant.flower;

import by.itacademy.javaProgrammingMethodes.consoleApp.flowerShop.plant.Plant;

public class Flower extends Plant implements Comparable<Flower> {
    private final FlowerName flowerName;
    private final FlowerColor flowerColor;

    public Flower(int plantId, int flowerStemHeight, int freshnessLevel,
                  FlowerName flowerName, FlowerColor flowerColor) {
        super(plantId, flowerName.getFlowerPrice(), flowerStemHeight, freshnessLevel);
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

    @Override
    public String toString() {
        return "Flower -> " +
                "Name: " + flowerName.getFlowerName() +
                ", flowerColor: " + flowerColor +
                ", Height: " + plantHeight +
                ", freshnessLevel: " + freshnessLevel +
                ", Price: " + plantPrice +
                ", Id: " + plantId;
    }

    public FlowerName getFlowerName() {
        return flowerName;
    }

    public FlowerColor getFlowerColor() {
        return flowerColor;
    }
}
