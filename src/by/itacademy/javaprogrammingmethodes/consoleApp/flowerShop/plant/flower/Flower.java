package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.flower;

import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.Plant;

public class Flower extends Plant {
    private final FlowerName flowerName;
    private final FlowerColor flowerColor;

    public Flower(int plantId, int plantPrice, int flowerStemHeight,
                  FlowerName flowerName, FlowerColor flowerColor) {
        super(plantId, plantPrice, flowerStemHeight);
        this.flowerName = flowerName;
        this.flowerColor = flowerColor;
    }

    @Override
    public void grow() {
        plantHeight += 5;
    }

    public FlowerName getFlowerName() {
        return flowerName;
    }

    public FlowerColor getFlowerColor() {
        return flowerColor;
    }
}
