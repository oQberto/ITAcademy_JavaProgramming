package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant;

import by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.flower.FlowerName;

public abstract class Plant {
    protected int plantId;
    protected int plantPrice;
    protected int plantHeight;
    protected int freshnessLevel;

    public Plant(int plantId, int plantPrice, int plantHeight, int freshnessLevel) {
        this.plantId = plantId;
        this.plantPrice = plantPrice;
        this.plantHeight = plantHeight;
        this.freshnessLevel = freshnessLevel;
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

    public int getPlantHeight() {
        return plantHeight;
    }
}
