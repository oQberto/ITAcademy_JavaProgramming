package by.itacademy.javaprogrammingmethodes.consoleApp.flowerShop.flowers;

public enum FlowerColor {
    WHITE("White"),
    YELLOW("Yellow"),
    ORANGE("Orange"),
    RED("Red"),
    PURPLE("Purple"),
    BLUE("Blue"),
    GREEN("Green"),
    BLACK("Black");
    private final String flowerColor;

    FlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getFlowerColor() {
        return flowerColor;
    }
}
