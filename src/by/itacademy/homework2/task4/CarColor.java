package by.itacademy.homework2.task4;

public enum CarColor {
    BLACK("Black"),
    BLUE("Blue"),
    GRAY("Gray"),
    GREEN("Green"),
    ORANGE("Orange"),
    PURPLE("Purple"),
    RED("Red"),
    WHITE("White"),
    YELLOW("Yellow");
    private static final CarColor[] audiColors = {BLUE, RED,  GREEN};
    private static final CarColor[] bmwColors = {ORANGE, BLACK,  PURPLE};
    private static final CarColor[] kiaColors = {YELLOW, GRAY,  WHITE};
    private final String carColor;

    CarColor(String color) {
        this.carColor = color;
    }

    public static CarColor[] getAudiColors() {
        return audiColors;
    }

    public static CarColor[] getBmwColors() {
        return bmwColors;
    }

    public static CarColor[] getKiaColors() {
        return kiaColors;
    }

    public String getCarColor() {
        return carColor;
    }
}
