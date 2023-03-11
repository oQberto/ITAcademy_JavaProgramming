package by.itacademy.homework4.car.enums.specialcarenums;

public enum SpecialCarBrand {
    VOLVO("Volvo"),
    FORD("Ford"),
    NISSAN("Nissan"),
    ;
    private final String carBrandName;

    SpecialCarBrand(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    public String getCarBrandName() {
        return carBrandName;
    }
}
