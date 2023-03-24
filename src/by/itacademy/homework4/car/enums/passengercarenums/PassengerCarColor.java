package by.itacademy.homework4.car.enums.passengercarenums;

import by.itacademy.homework4.car.markerinterfaces.Color;

public enum PassengerCarColor implements Color {
    BLACK("Black"),
    BLUE("Blue"),
    GREEN("Green"),
    RED("Red"),
    WHITE("White"),
    YELLOW("Yellow");
    private final String colorName;

    PassengerCarColor(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
