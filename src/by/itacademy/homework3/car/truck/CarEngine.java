package by.itacademy.homework3.car.truck;

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
