package by.itacademy.additionalTasks.inheritance.flowers.bouquet;

import by.itacademy.additionalTasks.inheritance.flowers.Flower;
import by.itacademy.additionalTasks.inheritance.flowers.FlowerColor;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private final List<Flower> flowers = new ArrayList<>();
    private final List<FlowerColor> flowerColors = new ArrayList<>();

    public int bouquetCost() {
        int bouquetCost = 0;
        for (Flower flower : this.flowers) {
            bouquetCost += flower.getFlowerCost();
        }
        return bouquetCost;
    }

    public int bouquetLifeTime() {
        int bouquetLifeTime = 0;
        for (Flower flower : this.flowers) {
            if (flower.getFlowerLifeTime() > bouquetLifeTime) {
                bouquetLifeTime = flower.getFlowerLifeTime();
            }
        }
        return bouquetLifeTime;
    }

    public List<FlowerColor> getFlowerColorsFromBouquet() {
        for (Flower flower : this.flowers) {
            flowerColors.add(flower.getFlowerColor());
        }
        return flowerColors;
    }

    public void addFlowerToBouquet(Flower flower) {
        this.flowers.add(flower);
    }

    public List<Flower> getFlowers() {
        return flowers;
    }
}
