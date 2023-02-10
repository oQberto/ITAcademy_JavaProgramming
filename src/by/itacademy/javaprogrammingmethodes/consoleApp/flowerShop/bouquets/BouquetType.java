package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.bouquets;

public enum BouquetType {
    BASKET(5, "Basket"),
    PAPER(2, "Paper");
    private final int price;
    private final String bouquetType;

    BouquetType(int price, String bouquetType) {
        this.price = price;
        this.bouquetType = bouquetType;
    }

    public int getPrice() {
        return price;
    }

    public String getBouquetType() {
        return bouquetType;
    }
}
