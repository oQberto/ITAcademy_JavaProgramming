package by.itacademy.homework2.task4;

public enum CarModel {
    AUDI("Audi"),
    BMW("BMW"),
    KIA("KIA");
    private final String carModel;

    CarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }
}
