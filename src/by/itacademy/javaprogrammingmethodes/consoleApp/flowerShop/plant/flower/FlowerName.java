package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.flower;

public enum FlowerName {
    ROSE("Rose"),
    TULIP("Tulip"),
    LILY("Lily"),
    BEGONIA("Begonia"),
    PEONY("Peony");
    private final String flowerName;

    FlowerName(String flowerType) {
        this.flowerName = flowerType;
    }

    public String getFlowerName() {
        return flowerName;
    }
}
