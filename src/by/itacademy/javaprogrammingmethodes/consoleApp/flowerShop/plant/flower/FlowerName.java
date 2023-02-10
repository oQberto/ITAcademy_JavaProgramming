package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.flower;

public enum FlowerName {
    ROSE("Rose", 1),
    TULIP("Tulip", 2),
    LILY("Lily", 3),
    BEGONIA("Begonia", 4),
    PEONY("Peony", 5);
    private final String flowerName;
    private final int flowerPrice;

    FlowerName(String flowerType, int flowerPrice) {
        this.flowerName = flowerType;
        this.flowerPrice= flowerPrice;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public int getFlowerPrice() {
        return flowerPrice;
    }
}
