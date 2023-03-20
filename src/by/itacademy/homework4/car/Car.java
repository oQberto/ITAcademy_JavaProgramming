package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    protected final int issueYear;
    protected final Brand carBrand;
    protected final Engine carEngine;
    protected Color carColor;
    protected WheelSize wheelSize;
    protected List<Option> options;

    public Car(int issueYear,
               Brand carBrand,
               Engine carEngine,
               Color carColor,
               WheelSize wheelSize,
               List<Option> options) {
        this.issueYear = issueYear;
        this.carBrand = carBrand;
        this.carEngine = carEngine;
        this.carColor = carColor;
        this.wheelSize = wheelSize;
        this.options = options == null ? new ArrayList<>() : options;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public Brand getCarBrand() {
        return carBrand;
    }

    public Engine getCarEngine() {
        return carEngine;
    }

    public Color getCarColor() {
        return carColor;
    }

    public void setCarColor(Color carColor) {
        this.carColor = carColor;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public abstract UniqueParam getUniqueParam();

    public abstract Color[] getColors();
    public abstract WheelSize[] getWheelSizes();

}
