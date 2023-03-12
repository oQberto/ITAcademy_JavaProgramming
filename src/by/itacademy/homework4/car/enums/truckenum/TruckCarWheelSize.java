package by.itacademy.homework4.car.enums.truckenum;

import by.itacademy.homework4.car.enums.WheelSize;

public enum TruckCarWheelSize implements WheelSize {
    SMALL(19),
    MIDDLE(20),
    LARGE(21);
    private final int wheelDiameter;

    TruckCarWheelSize(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }
}
