package by.itacademy.homework3.car;

import by.itacademy.homework3.car.specialcar.CarBrand;
import by.itacademy.homework3.car.specialcar.CarEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Car {
    private final int issueYear;
    private CarColor carColor;
    private CarWheelSize wheelSize;
    private List<Options> options;

    public Car(int issueYear,
               CarColor carColor,
               CarWheelSize wheelSize,
               List<Options> options) {
        this.issueYear = issueYear;
        this.carColor = carColor;
        this.wheelSize = wheelSize;
        this.options = options;
    }

    public Car(int issueYear,
               CarColor carColor,
               CarWheelSize wheelSize) {
        this.issueYear = issueYear;
        this.carColor = carColor;
        this.wheelSize = wheelSize;
        this.options = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Car{" +
                "issueYear=" + issueYear +
                ", carColor=" + carColor +
                ", wheelSize=" + wheelSize +
                ", options=" + options +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return issueYear == car.issueYear
                && carColor == car.carColor
                && wheelSize == car.wheelSize
                && options.equals(car.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueYear,
                            carColor,
                            wheelSize,
                            options);
    }

    public abstract CarBrand getCarBrand();

    public abstract CarEngine getCarEngine();

    public int getIssueYear() {
        return issueYear;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
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
