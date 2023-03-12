package by.itacademy.homework4.car.enums.truckenum;

import by.itacademy.homework4.car.enums.Color;

public enum TruckCarColor implements Color {
    BLACK("Black"),
    BLUE("Blue"),
    GREEN("Green"),
    RED("Red"),
    WHITE("White"),
    YELLOW("Yellow");
    private final String colorName;

    TruckCarColor(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
