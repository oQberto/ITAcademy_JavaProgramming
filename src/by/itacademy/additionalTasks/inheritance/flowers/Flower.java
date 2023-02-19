package by.itacademy.additionalTasks.inheritance.flowers;

public class Flower {
    protected int flowerCost;
    protected int flowerLifeTime;
    protected FlowerColor flowerColor;
    protected FlowerType flowerType;

    public Flower(int flowerCost, int flowerLiveTime, FlowerColor flowerColor) {
        this.flowerCost = flowerCost;
        this.flowerLifeTime = flowerLiveTime;
        this.flowerColor = flowerColor;
    }

    @Override
    public String toString() {
        return "Flower{ " +
                "flowerCost=" + flowerCost +
                ", flowerLiveTime=" + flowerLifeTime +
                ", flowerColor=" + flowerColor +
                " }";
    }

    public int getFlowerCost() {
        return flowerCost;
    }

    public void setFlowerCost(int flowerCost) {
        this.flowerCost = flowerCost;
    }

    public int getFlowerLifeTime() {
        return flowerLifeTime;
    }

    public void setFlowerLifeTime(int flowerLifeTime) {
        this.flowerLifeTime = flowerLifeTime;
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
