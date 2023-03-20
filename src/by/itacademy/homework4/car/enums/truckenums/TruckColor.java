package by.itacademy.homework4.car.enums.truckenums;

import by.itacademy.homework4.car.enums.Color;

public enum TruckColor implements Color {
    BLACK("Black"),
    BLUE("Blue"),
    GREEN("Green"),
    RED("Red"),
    WHITE("White"),
    YELLOW("Yellow"),
    ORANGE("Orange");
    private final String colorName;

    TruckColor(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
