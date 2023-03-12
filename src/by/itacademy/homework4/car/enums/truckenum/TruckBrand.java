package by.itacademy.homework4.car.enums.truckenum;

import by.itacademy.homework4.car.enums.Brand;

public enum TruckBrand implements Brand {
    VOLVO("Volvo"),
    FORD("Ford"),
    NISSAN("Nissan"),
    ;
    private final String carBrandName;

    TruckBrand(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    public String getCarBrandName() {
        return carBrandName;
    }
}
