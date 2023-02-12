package by.itacademy.homework3.car;

import java.util.List;

public class Car {
    private final CarBrand carBrand;
    private CarColor carColor;
    private final CarEngine carEngine;
    private CarWheelSize carWheelSize; // TODO сделать нормальные размеры колес
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

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    public CarEngine getCarEngine() {
        return carEngine;
    }

    public CarWheelSize getCarWheelSize() {
        return carWheelSize;
    }

    public void setCarWheelSize(CarWheelSize carWheelSize) {
        this.carWheelSize = carWheelSize;
    }

    public List<AdditionalOptions> getAdditionalOptions() {
        return additionalOptions;
    }

    public void setAdditionalOptions(List<AdditionalOptions> additionalOptions) {
        this.additionalOptions = additionalOptions;
    }
}
