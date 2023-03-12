package by.itacademy.homework4.car.enums.truckenums;

import by.itacademy.homework4.car.enums.Engine;

public enum TruckEngine implements Engine {
    COMMON_RAIL(2.9),
    ;
    private final double volume;

    TruckEngine(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
