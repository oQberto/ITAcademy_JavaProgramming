package by.itacademy.homework4.car.enums.passengercarenums;

import by.itacademy.homework4.car.markerinterfaces.Brand;

public enum PassengerCarBrand implements Brand {
    VOLVO("Volvo"),
    FORD("Ford"),
    NISSAN("Nissan"),
    ;
    private final String carBrandName;

    PassengerCarBrand(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    public String getCarBrandName() {
        return carBrandName;
    }
}
