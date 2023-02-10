package by.itacademy.javaProgrammingMethodes.consoleApp.flowerShop.bouquets;

import by.itacademy.javaProgrammingMethodes.consoleApp.flowerShop.plant.flower.Flower;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BouquetUtils {
    public static List<Flower> flowersByStemLength = new ArrayList<>();

    public static int getBouquetPrice(Bouquet bouquet) {
        if (bouquet == null) {
            return -1;
        }
        for (Flower flower : bouquet.flowers) {
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
