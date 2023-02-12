package by.itacademy.homework3.car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    private CarBrand carBrand;
    private CarColor carColor;
    private CarEngine carEngine;
    private CarWheelSize carWheelSize;
    private List<AdditionalOptions> additionalOptions;

    public Car(CarBrand carBrand, CarColor carColor, CarEngine carEngine,
               CarWheelSize carWheelSize, List<AdditionalOptions> additionalOptions) {
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.carEngine = carEngine;
        this.carWheelSize = carWheelSize;
        this.additionalOptions = additionalOptions;
    }

    @Override
    public String toString() {
        return "Car{ " +
                "carBrand=" + carBrand +
                ", carColor=" + carColor +
                ", carEngine=" + carEngine +
                ", carWheelSize=" + carWheelSize +
                " }";
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public CarEngine getCarEngine() {
        return carEngine;
    }

    public CarWheelSize getCarWheelSize() {
        return carWheelSize;
    }

    public List<AdditionalOptions> getAdditionalOptions() {
        return additionalOptions;
    }
}
