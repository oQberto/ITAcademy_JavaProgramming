package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant;

public abstract class Plant {
    protected int plantId;
    protected int plantPrice;

    public Plant(int plantId, int plantPrice) {
        this.plantId = plantId;
        this.plantPrice = plantPrice;
    }

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
