package by.itacademy.homework3.car.truck;

import by.itacademy.homework3.car.Car;
import by.itacademy.homework3.car.CarColor;
import by.itacademy.homework3.car.CarWheelSize;
import by.itacademy.homework3.car.Options;

import java.util.List;

public class Truck extends Car {
    private final CarType carType;
    private final CarBrand carBrand;
    private final CarEngine carEngine;
    private int loadCapacity;

    public Truck(CarType carType,
                 CarBrand carBrand,
                 CarEngine carEngine,
                 int issueYear,
                 CarColor carColor,
                 CarWheelSize wheelSize,
                 List<Options> options,
                 int loadCapacity) {
        super(issueYear, carColor, wheelSize, options);
        this.carType = carType;
        this.carBrand = carBrand;
        this.carEngine = carEngine;
        this.loadCapacity = loadCapacity;
    }

    public Truck(CarType carType,
                 CarBrand carBrand,
                 CarEngine carEngine,
                 int issueYear,
                 CarColor carColor,
                 CarWheelSize wheelSize,
                 int loadCapacity) {
        super(issueYear, carColor, wheelSize);
        this.carType = carType;
        this.carBrand = carBrand;
        this.carEngine = carEngine;
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String getCarType() {
        return carType.name();
    }

    @Override
    public String getCarBrand() {
        return carBrand.name();
    }

    @Override
    public String getCarEngine() {
        return carEngine.name();
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
