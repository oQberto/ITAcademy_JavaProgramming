package by.itacademy.javaProgrammingMethodes.car;

public class Car {
    private Wheel wheel;
    private Engine engine;
    private final CarBrand carBrand;
    private boolean carInMotion;

    public Car(Wheel wheel, Engine engine, CarBrand carBrand) {
        this.wheel = wheel;
        this.engine = engine;
        this.carBrand = carBrand;
    }

    public void drive() {
        carInMotion = true;
    }

    public void stop() {
        carInMotion = false;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }
}
