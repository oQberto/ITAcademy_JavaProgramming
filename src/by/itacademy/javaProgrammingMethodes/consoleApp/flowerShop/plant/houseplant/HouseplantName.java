package by.itacademy.javaProgrammingMethodes.consoleApp.flowerShop.plant.houseplant;

public enum HouseplantName {
    BONSAI("Bonsai", 1),
    CACTUS("Cactus", 2),
    PALM("Palm", 3);
    private final String houseplantName;
    private final int houseplantPrice;

    HouseplantName(String houseplantName, int houseplantPrice) {
        this.houseplantName = houseplantName;
        this.houseplantPrice = houseplantPrice;
    }

    public String getHouseplantName() {
        return houseplantName;
    }

    public int getHouseplantPrice() {
        return houseplantPrice;
    }
}
