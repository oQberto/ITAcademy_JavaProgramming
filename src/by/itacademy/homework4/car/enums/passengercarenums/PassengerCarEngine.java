package by.itacademy.homework4.car.enums.passengercarenums;

import by.itacademy.homework4.car.markerinterfaces.Engine;

public enum PassengerCarEngine implements Engine {
    COMMON_RAIL(2.9),
    ;
    private final double volume;

    PassengerCarEngine(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
