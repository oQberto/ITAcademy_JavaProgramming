package by.itacademy.homework4.car.enums.passengercarenums;

import by.itacademy.homework4.car.markerinterfaces.WheelSize;

public enum PassengerCarWheelSize implements WheelSize {
    SMALL(19),
    MIDDLE(20),
    LARGE(21);
    private final int wheelDiameter;

    PassengerCarWheelSize(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }
}
