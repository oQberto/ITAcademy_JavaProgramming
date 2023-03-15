package by.itacademy.homework4.order;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.*;

import java.util.List;
import java.util.Objects;

public abstract class Order {
    protected int issueYear;
    protected Brand brand;
    protected Engine engine;
    protected Color color;
    protected WheelSize wheelSize;
    protected List<Options> options;

    public Order(int issueYear,
                 Brand brand,
                 Engine engine,
                 Color color,
                 WheelSize wheelSize,
                 List<Options> options) {
        this.issueYear = issueYear;
        this.brand = brand;
        this.engine = engine;
        this.color = color;
        this.wheelSize = wheelSize;
        this.options = options;
    }

    public boolean compare(Car car) {
        return this.issueYear == car.getIssueYear()
                && this.brand == car.getCarBrand()
                && this.engine == car.getCarEngine()
                && this.color == car.getCarColor()
                && this.wheelSize == car.getWheelSize()
                && this.options == car.getOptions();
    }

    @Override
    public int hashCode() {
        return Objects
                .hash(issueYear,
                        brand,
                        engine,
                        color,
                        wheelSize,
                        options);
    }

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

    public List<Options> getOptions() {
        return options;
    }

    public void setOptions(List<Options> options) {
        this.options = options;
    }
}
