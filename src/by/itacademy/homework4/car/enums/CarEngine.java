package by.itacademy.homework4.car.enums;

public enum CarEngine {
    COMMON_RAIL(2.9),
    ;
    private final double volume;

    CarEngine(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
