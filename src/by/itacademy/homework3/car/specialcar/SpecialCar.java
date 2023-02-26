package by.itacademy.homework3.car.specialcar;

import by.itacademy.homework3.car.*;

import java.util.List;

public class SpecialCar extends Car {
    private final CarType carType;
    private final CarBrand carBrand;
    private final CarEngine carEngine;
    private boolean flashLight;

    public SpecialCar(CarType carType,
                      CarBrand carBrand,
                      CarEngine carEngine,
                      int issueYear,
                      CarColor carColor,
                      CarWheelSize wheelSize,
                      List<Options> options,
                      boolean flashLight) {
        super(issueYear, carColor, wheelSize, options);
        this.carType = carType;
        this.carBrand = carBrand;
        this.carEngine = carEngine;
        this.flashLight = flashLight;
    }

    public SpecialCar(CarType carType,
                      CarBrand carBrand,
                      CarEngine carEngine,
                      int issueYear,
                      CarColor carColor,
                      CarWheelSize wheelSize,
                      boolean flashLight) {
        super(issueYear, carColor, wheelSize);
        this.carType = carType;
        this.carBrand = carBrand;
        this.carEngine = carEngine;
        this.flashLight = flashLight;
    }

    @Override
    public CarType getCarType() {
        return carType;
    }

    @Override
    public CarBrand getCarBrand() {
        return carBrand;
    }

    @Override
    public CarEngine getCarEngine() {
        return carEngine;
    }

    public boolean isFlashLight() {
        return flashLight;
    }

    public void setFlashLight(boolean flashLight) {
        this.flashLight = flashLight;
    }
}
