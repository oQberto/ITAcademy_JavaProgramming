package by.itacademy.homework3.car.specialcar;

public enum CarType {
    AMBULANCE("Ambulance"),
    POLICE_CAR("Police car"),
    FIRE_CAR("Fire car"),
    ;
    private final String carTypeName;

    CarType(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public String getCarTypeName() {
        return carTypeName;
    }
}
