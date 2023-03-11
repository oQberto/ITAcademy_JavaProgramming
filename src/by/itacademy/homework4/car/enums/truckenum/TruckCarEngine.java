package by.itacademy.homework4.car.enums.truckenum;

public enum TruckCarEngine {
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
