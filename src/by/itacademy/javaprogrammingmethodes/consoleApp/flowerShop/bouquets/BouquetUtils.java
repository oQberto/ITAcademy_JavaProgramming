package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.bouquets;

import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.Plant;
import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.flower.Flower;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BouquetUtils {
    public static List<Flower> flowersByStemLength = new ArrayList<>();

    public static int getBouquetPrice(Bouquet bouquet) {
        if (bouquet == null) {
            return -1;
        }
        for (Plant flower : bouquet.flowers) {
            bouquet.setBouquetPrice(flower.getPlantPrice());
        }
        return bouquet.getBouquetPrice();
    }

    public static void sortFlowersByFreshness(Bouquet bouquet) {
        Arrays.sort(bouquet.flowers);
    }

    public static void findFlowersByStemLength(Bouquet bouquet, int fromLength, int toLength) {
        for (Flower flower : bouquet.flowers) {
            if (flower.getPlantHeight() > fromLength
                    && flower.getPlantHeight() < toLength) {
                flowersByStemLength.add(flower);
            }
        }
    }
}
