package by.itacademy.homework4.car.enums.specialcarenums;

public enum SpecialCarColor {
    BLACK("Black"),
    BLUE("Blue"),
    GREEN("Green"),
    RED("Red"),
    WHITE("White"),
    YELLOW("Yellow");
    private final String colorName;

    SpecialCarColor(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
