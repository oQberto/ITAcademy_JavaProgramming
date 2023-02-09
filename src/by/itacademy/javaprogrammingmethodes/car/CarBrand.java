package by.itacademy.javaprogrammingmethodes.car;

public enum CarBrand {
    AUDI("Audi"),
    BMW("BMW"),
    KIA("KIA"),
    NISSAN("Nissan");
    private final String carBrand;

    CarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarBrand() {
        return carBrand;
    }
}
