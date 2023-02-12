package by.itacademy.homework3.car;

public enum CarColor {
    BLACK("Black"),
    BLUE("Blue"),
    GREEN("Green"),
    RED("Red"),
    WHITE("WHITE"),
    YELLOW("YELLOW");
    private final String colorName;

    CarColor(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
