package by.itacademy.homework4.car.enums.truckenum;

import by.itacademy.homework4.car.enums.Engine;

public enum TruckCarEngine implements Engine {
    COMMON_RAIL(2.9),
    ;
    private final double volume;

    TruckCarEngine(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
