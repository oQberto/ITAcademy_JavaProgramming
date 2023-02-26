package by.itacademy.homework3.car.truck;

public enum CarBrand {
    MERCEDES_BENZ("Mercedes benz"),
    TATRA("Tatra"),
    MITSUBISHI("Mitsubishi"),
    ;
    private final String carBrandName;

    CarBrand(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    public String getCarBrandName() {
        return carBrandName;
    }
}
