package by.itacademy.homework4.order;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.*;

import java.util.List;

public abstract class Order<T extends Car> {
    protected int issueYear;
    protected Brand brand;
    protected Engine engine;
    protected Color color;
    protected WheelSize wheelSize;
    protected List<Options> optionsList;

    public Order(int issueYear,
                 Brand brand,
                 Engine engine,
                 Color color,
                 WheelSize wheelSize,
                 List<Options> optionsList) {
        this.issueYear = issueYear;
        this.brand = brand;
        this.engine = engine;
        this.color = color;
        this.wheelSize = wheelSize;
        this.optionsList = optionsList;
    }

    public abstract boolean equals(T car);

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public List<Options> getOptionsList() {
        return optionsList;
    }

    public void setOptionsList(List<Options> optionsList) {
        this.optionsList = optionsList;
    }
}
