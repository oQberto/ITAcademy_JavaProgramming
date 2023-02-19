package by.itacademy.additionalTasks.inheritance.flowers;

public class Flower {
    protected int flowerCost;
    protected int flowerLiveTime;
    protected FlowerColor flowerColor;

    public Flower(int flowerCost, int flowerLiveTime, FlowerColor flowerColor) {
        this.flowerCost = flowerCost;
        this.flowerLiveTime = flowerLiveTime;
        this.flowerColor = flowerColor;
    }

    @Override
    public String toString() {
        return "Flower{ " +
                "flowerCost=" + flowerCost +
                ", flowerLiveTime=" + flowerLiveTime +
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
        return flowerLiveTime;
    }

    public void setFlowerLiveTime(int flowerLiveTime) {
        this.flowerLiveTime = flowerLiveTime;
    }

    public FlowerColor getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(FlowerColor flowerColor) {
        this.flowerColor = flowerColor;
    }
}
