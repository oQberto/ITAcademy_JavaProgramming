package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant;

public abstract class Plant {
    private int plantId;
    private int plantPrice;


    public Plant(int flowerId, int flowerPrice) {
        this.plantId = flowerId;
        this.plantPrice = flowerPrice;
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
