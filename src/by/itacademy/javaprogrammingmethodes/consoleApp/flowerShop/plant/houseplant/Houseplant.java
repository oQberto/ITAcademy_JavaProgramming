package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.houseplant;

import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.Plant;

public class Houseplant extends Plant {
    private final int houseplantHeight;
    private final int sizeOfFlowerPot;
    private final HouseplantName houseplantName;

    public Houseplant(int plantId, int plantPrice, int houseplantHeight,
                      int sizeOfFlowerPot, HouseplantName houseplantName) {
        super(plantId, plantPrice);
        this.houseplantHeight = houseplantHeight;
        this.sizeOfFlowerPot = sizeOfFlowerPot;
        this.houseplantName = houseplantName;
    }

    public int getHouseplantHeight() {
        return houseplantHeight;
    }

    public int getSizeOfFlowerPot() {
        return sizeOfFlowerPot;
    }

    public HouseplantName getHouseplantName() {
        return houseplantName;
    }
}
