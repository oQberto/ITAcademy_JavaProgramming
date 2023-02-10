package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.bouquets;

public enum BouquetType {
    SMALL_BASKET(5, 5, "Small basket"),
    MIDDLE_BASKET(5, 10, "Middle basket"),
    LARGE_BASKET(5, 15, "Large basket"),
    PAPER(2, 20, "Paper");
    private final int price;
    private final int bouquetCapacity;
    private final String bouquetType;

    BouquetType(int price, int bouquetCapacity, String bouquetType) {
        this.price = price;
        this.bouquetCapacity = bouquetCapacity;
        this.bouquetType = bouquetType;
    }

    public int getPrice() {
        return price;
    }

    public int getBouquetCapacity() {
        return bouquetCapacity;
    }

    public String getBouquetType() {
        return bouquetType;
    }
}
