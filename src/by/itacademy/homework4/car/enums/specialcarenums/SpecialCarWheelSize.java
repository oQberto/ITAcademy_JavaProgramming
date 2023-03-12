package by.itacademy.homework4.car.enums.specialcarenums;

import by.itacademy.homework4.car.enums.WheelSize;

public enum SpecialCarWheelSize implements WheelSize {
    SMALL(19),
    MIDDLE(20),
    LARGE(21);
    private final int wheelDiameter;

    SpecialCarWheelSize(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }
}
