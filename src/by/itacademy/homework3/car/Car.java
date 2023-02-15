package by.itacademy.homework3.car;

import java.util.List;

public class Car {
    private final CarBrand carBrand;
    private CarColor carColor;
    private final CarEngine carEngine;
    private CarWheelSize wheelSize;
    private List<Options> options;

    public Car(CarBrand carBrand, CarColor carColor, CarEngine carEngine,
               CarWheelSize wheelSize, List<Options> options) {
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.carEngine = carEngine;
        this.wheelSize = wheelSize;
        this.options = options;
    }

    public Car(CarBrand carBrand, CarColor carColor, CarEngine carEngine,
               CarWheelSize wheelSize) {
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.carEngine = carEngine;
        this.wheelSize = wheelSize;
    }

    @Override
    public String toString() {
        return "Car{ " +
                "carBrand=" + carBrand +
                ", carColor=" + carColor +
                ", carEngine=" + carEngine +
                ", carWheelSize=" + wheelSize +
                " }";
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    public CarEngine getCarEngine() {
        return carEngine;
    }

    public CarWheelSize getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(CarWheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public List<Options> getOptions() {
        return options;
    }

    public void setOptions(List<Options> options) {
        this.options = options;
    }
}
