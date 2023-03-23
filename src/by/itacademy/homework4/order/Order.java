package by.itacademy.homework4.order;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.markerinterfaces.*;

import static by.itacademy.homework4.validation.Message.NullMessages.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Objects.*;

public abstract class Order {
    protected int issueYear;
    protected Brand brand;
    protected Engine engine;
    protected Color color;
    protected WheelSize wheelSize;
    protected List<Option> options;

    public Order(int issueYear,
                 Brand brand,
                 Engine engine,
                 Color color,
                 WheelSize wheelSize,
                 List<Option> options) {
        this.issueYear = issueYear;

        requireNonNull(brand, NULL_BRAND);
        this.brand = brand;

        requireNonNull(engine, NULL_ENGINE);
        this.engine = engine;

        requireNonNull(color, NULL_COLOR);
        this.color = color;

        requireNonNull(wheelSize, NULL_WHEEL_SIZE);
        this.wheelSize = wheelSize;
        this.options = options == null ? new ArrayList<>() : options;
    }

    public boolean compare(Car car) {
        requireNonNull(car, NULL_CAR);

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
        requireNonNull(brand, NULL_BRAND);
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        requireNonNull(engine, NULL_ENGINE);
        this.engine = engine;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        requireNonNull(color, NULL_COLOR);
        this.color = color;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(WheelSize wheelSize) {
        requireNonNull(wheelSize, NULL_WHEEL_SIZE);
        this.wheelSize = wheelSize;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options =
                options == null
                        ? new ArrayList<>()
                        : options;
    }

    public abstract UniqueParam getUniqueParam();

    public abstract void setUniqueParam(UniqueParam uniqueParam);
}
