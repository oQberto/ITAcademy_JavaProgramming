package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop;

import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.Plant;

import java.util.ArrayList;
import java.util.List;

public class FlowerShopCatalogue {
    private final List<Plant> flowerShopCatalogue = new ArrayList<>();

    public FlowerShopCatalogue() {
    }

    public void addPlantToCatalogue(Plant plant) {
        flowerShopCatalogue.add(plant);
    }

    public void showCatalogue() {
        for (Plant plant : flowerShopCatalogue) {
            System.out.println(plant);
        }
    }
}
