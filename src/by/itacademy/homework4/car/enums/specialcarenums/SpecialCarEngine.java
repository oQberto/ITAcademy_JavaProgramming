package by.itacademy.homework4.car.enums.specialcarenums;

import by.itacademy.homework4.car.markerinterfaces.Engine;

public enum SpecialCarEngine implements Engine {
    COMMON_RAIL(2.9),
    ;
    private final double volume;

    SpecialCarEngine(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
