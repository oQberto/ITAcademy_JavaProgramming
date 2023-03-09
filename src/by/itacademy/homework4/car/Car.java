package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    protected final int issueYear;
    protected final CarBrand carBrand;
    protected final CarEngine carEngine;
    protected CarColor carColor;
    protected CarWheelSize wheelSize;
    protected List<Options> options;

    public Car(int issueYear,
               CarBrand carBrand,
               CarEngine carEngine,
               CarColor carColor,
               CarWheelSize carWheelSize,
               List<Options> options) {
        this.issueYear = issueYear;
        this.carBrand = carBrand;
        this.carEngine = carEngine;
        this.carColor = carColor;
        this.wheelSize = carWheelSize;
        this.options = options == null ? new ArrayList<>() : options;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public CarEngine getCarEngine() {
        return carEngine;
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

    public void setOptions(List<Options> optionsList) {
        this.options = optionsList;
    }
}
