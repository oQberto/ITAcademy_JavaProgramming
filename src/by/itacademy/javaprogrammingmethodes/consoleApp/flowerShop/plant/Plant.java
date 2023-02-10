package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant;

import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.flower.FlowerName;

public abstract class Plant {
    protected int plantId;
    protected int plantPrice;
    protected int plantHeight;

    public Plant(int plantId, int plantPrice, int plantHeight) {
        this.plantId = plantId;
        this.plantPrice = plantPrice;
        this.plantHeight = plantHeight;
    }

    public abstract void grow();

    public int getPlantId() {
        return plantId;
    }

    public void setPlantId(int plantId) {
        this.plantId = plantId;
    }

    public int getPlantPrice() {
        return plantPrice;
    }

    public void setPlantPrice(int plantPrice) {
        this.plantPrice = plantPrice;
    }
}
