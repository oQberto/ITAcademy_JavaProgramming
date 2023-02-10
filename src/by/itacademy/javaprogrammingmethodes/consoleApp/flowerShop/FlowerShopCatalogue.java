package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop;

import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.Plant;
import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.flower.Flower;
import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.flower.FlowerColor;
import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.flower.FlowerName;
import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.houseplant.Houseplant;
import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.houseplant.HouseplantName;

import java.util.ArrayList;
import java.util.List;

public class FlowerShopCatalogue {
    private final List<Plant> flowerShopCatalogue = new ArrayList<>();

    {
        System.out.println("Catalogue: ");
        flowerShopCatalogue.add(new Houseplant(1, 10, 100, 23, HouseplantName.BONSAI));
        flowerShopCatalogue.add(new Houseplant(2, 5, 80, 15, HouseplantName.CACTUS));
        flowerShopCatalogue.add(new Houseplant(3, 15, 70, 30, HouseplantName.PALM));
        flowerShopCatalogue.add(new Flower(4, 30, 85, FlowerName.ROSE, FlowerColor.RED));
        flowerShopCatalogue.add(new Flower(5, 30, 90, FlowerName.TULIP, FlowerColor.RED));
        flowerShopCatalogue.add(new Flower(6, 30, 87, FlowerName.LILY, FlowerColor.RED));
        flowerShopCatalogue.add(new Flower(7, 30, 64, FlowerName.BEGONIA, FlowerColor.RED));
        flowerShopCatalogue.add(new Flower(8, 30, 98, FlowerName.PEONY, FlowerColor.RED));
        showCatalogue();
    }
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

    public List<Plant> getFlowerShopCatalogue() {
        return flowerShopCatalogue;
    }
}
