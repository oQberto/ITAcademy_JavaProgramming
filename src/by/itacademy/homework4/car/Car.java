package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.*;

import java.util.List;

public abstract class Car {
    protected final int issueYear;

    public Car(int issueYear) {
        this.issueYear = issueYear;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public abstract Brand getCarBrand();
    public abstract Engine getCarEngine();
    public abstract Color getCarColor();
    public abstract WheelSize getWheelSize();
    public abstract List<Options> getOptions();
    public abstract Color[] getColors();
    public abstract WheelSize[] getWheelSizes();
    public abstract void setCarColor(Color color);
    public abstract void setWheelSize(WheelSize wheelSize);
    public abstract void setOptions(List<Options> options);
}
