package by.itacademy.homework4.car.enums.specialcarenums;

import by.itacademy.homework4.car.enums.Brand;

public enum SpecialCarBrand implements Brand {
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
