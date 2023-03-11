package by.itacademy.homework4.car.enums.truckenum;

public enum TruckCarBrand {
    VOLVO("Volvo"),
    FORD("Ford"),
    NISSAN("Nissan"),
    ;
    private final String carBrandName;

    TruckCarBrand(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    public String getCarBrandName() {
        return carBrandName;
    }
}
