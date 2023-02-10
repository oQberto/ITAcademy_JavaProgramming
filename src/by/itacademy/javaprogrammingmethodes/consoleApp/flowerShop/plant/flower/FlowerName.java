package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.flower;

public enum FlowerName {
    SUNFLOWER("Sunflower"),
    CLOVER("Clover"),
    POPPY("Poppy"),
    CHAMOMILE("Chamomile"),

    ROSE("Rose"),
    TULIP("Tulip"),
    LILY("Lily"),
    BEGONIA("Begonia"),
    PEONY("Peony");
    private final String flowerName;
    private static final FlowerName[] WILD_FLOWERS = {SUNFLOWER, CLOVER, POPPY, CHAMOMILE};
    private static final FlowerName[] GARDEN_FLOWERS = {ROSE, TULIP, LILY, BEGONIA, PEONY};

    FlowerName(String flowerType) {
        this.flowerName = flowerType;
    }

    public String getFlowerName() {
        return flowerName;
    }
}
