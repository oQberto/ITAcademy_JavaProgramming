package by.itacademy.homework3.car;

import java.util.List;
import java.util.Objects;

public class Car {
    private final CarBrand carBrand;
    private final CarEngine carEngine;
    private final int issueYear;
    private CarColor carColor;
    private CarWheelSize wheelSize;
    private List<Options> options;

    public Car(CarBrand carBrand, CarEngine carEngine, int issueYear,
               CarColor carColor, CarWheelSize wheelSize, List<Options> options) {
        this.carBrand = carBrand;
        this.carEngine = carEngine;
        this.issueYear = issueYear;
        this.carColor = carColor;
        this.wheelSize = wheelSize;
        this.options = options;
    }

    public Car(CarBrand carBrand, CarEngine carEngine, int issueYear,
               CarColor carColor, CarWheelSize wheelSize) {
        this.carBrand = carBrand;
        this.carEngine = carEngine;
        this.issueYear = issueYear;
        this.carColor = carColor;
        this.wheelSize = wheelSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return issueYear == car.issueYear
                && carBrand == car.carBrand
                && carEngine == car.carEngine
                && carColor == car.carColor
                && wheelSize == car.wheelSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, carEngine, issueYear, carColor, wheelSize, options);
    }

    @Override
    public String toString() {
        return "Car{ " +
                "carBrand=" + carBrand +
                ", carEngine=" + carEngine +
                ", issueYear=" + issueYear +
                ", carColor=" + carColor +
                ", wheelSize=" + wheelSize +
                ", options=" + options +
                " }";
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public CarEngine getCarEngine() {
        return carEngine;
    }

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
