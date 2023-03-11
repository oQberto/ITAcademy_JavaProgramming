package by.itacademy.homework4.car.enums.specialcarenums;

public enum SpecialCarEngine {
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
