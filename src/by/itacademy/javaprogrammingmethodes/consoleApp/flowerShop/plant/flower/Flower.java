package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.flower;

import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.Plant;

public class Flower extends Plant {
    private int flowerStemHeight;
    private final FlowerName flowerName;
    private final FlowerColor flowerColor;

    public Flower(int plantId, int plantPrice, int flowerStemHeight,
                  FlowerName flowerName, FlowerColor flowerColor) {
        super(plantId, plantPrice);
        this.flowerStemHeight = flowerStemHeight;
        this.flowerName = flowerName;
        this.flowerColor = flowerColor;
    }

    public int getFlowerStemHeight() {
        return flowerStemHeight;
    }

    public void setFlowerStemHeight(int flowerStemHeight) {
        this.flowerStemHeight = flowerStemHeight;
    }

    public FlowerName getFlowerName() {
        return flowerName;
    }

    public FlowerColor getFlowerColor() {
        return flowerColor;
    }
}
