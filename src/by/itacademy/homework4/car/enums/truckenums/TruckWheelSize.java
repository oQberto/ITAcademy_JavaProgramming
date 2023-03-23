package by.itacademy.homework4.car.enums.truckenums;

import by.itacademy.homework4.car.markerinterfaces.WheelSize;

public enum TruckWheelSize implements WheelSize {
    SMALL(19),
    MIDDLE(20),
    LARGE(21);
    private final int wheelDiameter;

    TruckWheelSize(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }
}
