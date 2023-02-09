package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.flowers;

public enum FlowerType {
    SUNFLOWER("Sunflower"),
    CLOVER("Clover"),
    POPPY("Poppy"),
    CHAMOMILE("Chamomile"),

    ROSE("Rose"),
    TULIP("Tulip"),
    LILY("Lily"),
    BEGONIA("Begonia"),
    PEONY("Peony");
    private final String flowerType;
    private static final FlowerType[] WILD_FLOWERS = {SUNFLOWER, CLOVER, POPPY, CHAMOMILE};
    private static final FlowerType[] GARDEN_FLOWERS = {ROSE, TULIP, LILY, BEGONIA, PEONY};

    FlowerType(String flowerType) {
        this.flowerType = flowerType;
    }

    public String getFlowerType() {
        return flowerType;
    }
}
