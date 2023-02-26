package by.itacademy.homework3.car.truck;

public enum CarType {
    ONBOARD_CAR("Onboard car"),
    DUMP_TRUCK("Dump truck"),
    TRUCK_TRACTOR("Truck tractor"),
    ;
    private final String carTypeName;

    CarType(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public String getCarTypeName() {
        return carTypeName;
    }
}
