package by.itacademy.homework4.car;

import by.itacademy.homework4.car.markerinterfaces.*;

import static by.itacademy.homework4.messages.Message.NullMessages.*;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.*;

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
        requireNonNull(carBrand, NULL_BRAND);
        this.carBrand = carBrand;
        requireNonNull(carEngine, NULL_ENGINE);
        this.carEngine = carEngine;
        requireNonNull(carColor, NULL_COLOR);
        this.carColor = carColor;
        requireNonNull(wheelSize, NULL_WHEEL_SIZE);
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
    public abstract void setUniqueParam(UniqueParam uniqueParam);

    public abstract Color[] getColors();

    public abstract WheelSize[] getWheelSizes();

}
