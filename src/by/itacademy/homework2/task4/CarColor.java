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
    private final String carColor;


    CarColor(String color) {
        this.carColor = color;
    }

    public String getCarColor() {
        return carColor;
    }
}
