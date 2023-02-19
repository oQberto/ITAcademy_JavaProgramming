package by.itacademy.homework3.carShowroom;

import by.itacademy.homework3.car.*;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final CarBrand carBrand;
    private final CarEngine carEngine;
    private final int issueYear;
    private CarColor carColor;
    private CarWheelSize wheelSize;
    private List<Options> options;

    public Order(CarBrand carBrand, CarEngine carEngine, int issueYear,
               CarColor carColor, CarWheelSize wheelSize, List<Options> options) {
        this.carBrand = carBrand;
        this.carEngine = carEngine;
        this.issueYear = issueYear;
        this.carColor = carColor;
        this.wheelSize = wheelSize;
        this.options = options;
    }

    public Order(CarBrand carBrand, CarEngine carEngine, int issueYear,
               CarColor carColor, CarWheelSize wheelSize) {
        this.carBrand = carBrand;
        this.carEngine = carEngine;
        this.issueYear = issueYear;
        this.carColor = carColor;
        this.wheelSize = wheelSize;
        this.options = new ArrayList<>();
    }


    public boolean equals(Car car) {
        if (car == null) return false;
        return issueYear == car.getIssueYear()
                && carBrand == car.getCarBrand()
                && carEngine == car.getCarEngine()
                && carColor == car.getCarColor()
                && wheelSize == car.getWheelSize()
                && options.equals(car.getOptions());
    }

    @Override
    public String toString() {
        return "Order{ " +
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
