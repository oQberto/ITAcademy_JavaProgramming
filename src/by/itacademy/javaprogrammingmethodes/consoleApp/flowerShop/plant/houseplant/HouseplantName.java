package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.plant.houseplant;

public enum HouseplantName {
    BONSAI("Bonsai"),
    CACTUS("Cactus"),
    PALM("Palm");
    private final String houseplantName;

    HouseplantName(String houseplantName) {
        this.houseplantName = houseplantName;
    }

    public String getHouseplantName() {
        return houseplantName;
    }
}
