package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.houseplant;

import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.Plant;
import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.flower.Bloomed;

public class Houseplant extends Plant implements Bloomed {
    private final int sizeOfFlowerPot;
    private final HouseplantName houseplantName;
    private boolean isBlooming = false;

    public Houseplant(int plantId, int houseplantHeight, int freshnessLevel,
                      int sizeOfFlowerPot, HouseplantName houseplantName) {
        super(plantId, houseplantName.getHouseplantPrice(), houseplantHeight, freshnessLevel);
        this.sizeOfFlowerPot = sizeOfFlowerPot;
        this.houseplantName = houseplantName;
    }

    @Override
    public void bloom() {
        isBlooming = true;
    }

    @Override
    public void stopBloom() {
        isBlooming = false;
    }

    @Override
    public void grow() {
        switch (this.houseplantName.getHouseplantName()) {
            case "Bonsai" -> plantHeight += 4;
            case "Cactus" -> plantHeight += 2;
            case "Palm" -> plantHeight += 1;
        }
    }

    @Override
    public String toString() {
        return "Houseplant -> " +
                "Name: " + houseplantName.getHouseplantName() +
                ", isBlooming: " + isBlooming +
                ", sizeOfFlowerPot: " + sizeOfFlowerPot +
                ", Height: " + plantHeight +
                ", freshnessLevel: " + freshnessLevel +
                ", Price: " + plantPrice +
                ", Id :" + plantId;
    }

    public int getSizeOfFlowerPot() {
        return sizeOfFlowerPot;
    }

    public HouseplantName getHouseplantName() {
        return houseplantName;
    }
}
