package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop;

public enum FlowerType {
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
