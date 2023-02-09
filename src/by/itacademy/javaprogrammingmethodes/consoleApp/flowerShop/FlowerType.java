package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop;

public enum FlowerType {
    SUNFLOWER("Sunflower"),
    CLOVER("Clover"),
    POPPY("Poppy"),
    CHAMOMILE("Chamomile"),

    ROSE("Rose"),
    TULIP("Tulip"),
    LILY("Lily"),
    BEGONIA("Begonia"),
    PEONY("Peony"),
    ORCHID("Orchid");
    private final String flowerType;

    FlowerType(String flowerType) {
        this.flowerType = flowerType;
    }

    public String getFlowerType() {
        return flowerType;
    }
}
