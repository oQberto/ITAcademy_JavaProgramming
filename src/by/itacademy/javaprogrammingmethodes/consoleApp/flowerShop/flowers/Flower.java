package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.flowers;

public abstract class Flower {
    private int flowerId;
    private int flowerHight;
    private int flowerPrice;
    private String flowerVariety;
    private FlowerColor flowerColor;
    private FlowerType flowerType;

    public Flower(int flowerId, int flowerHight, int flowerPrice, String flowerVariety,
                  FlowerColor flowerColor, FlowerType flowerType) {
        this.flowerId = flowerId;
        this.flowerHight = flowerHight;
        this.flowerPrice = flowerPrice;
        this.flowerVariety = flowerVariety;
        this.flowerColor = flowerColor;
        this.flowerType = flowerType;
    }

    public int getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(int flowerId) {
        this.flowerId = flowerId;
    }

    public int getFlowerHight() {
        return flowerHight;
    }

    public void setFlowerHight(int flowerHight) {
        this.flowerHight = flowerHight;
    }

    public int getFlowerPrice() {
        return flowerPrice;
    }

    public void setFlowerPrice(int flowerPrice) {
        this.flowerPrice = flowerPrice;
    }

    public String getFlowerVariety() {
        return flowerVariety;
    }

    public void setFlowerVariety(String flowerVariety) {
        this.flowerVariety = flowerVariety;
    }

    public FlowerColor getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(FlowerColor flowerColor) {
        this.flowerColor = flowerColor;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }
}
