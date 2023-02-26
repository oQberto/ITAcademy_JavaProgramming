package by.itacademy.homework3.car.specialcar;

import by.itacademy.homework3.car.*;

import java.util.List;

public class SpecialCar extends Car {
    private final SpecialCarType carType;
    private final CarBrand carBrand;
    private final CarEngine carEngine;
    private boolean flashLight;

    public SpecialCar(CarBrand carBrand,
                      CarEngine carEngine,
                      int issueYear,
                      CarColor carColor,
                      CarWheelSize wheelSize,
                      List<Options> options,
                      SpecialCarType carType,
                      boolean flashLight) {
        super(issueYear, carColor, wheelSize, options);
        this.carBrand = carBrand;
        this.carEngine = carEngine;
        this.carType = carType;
        this.flashLight = flashLight;
    }

    public SpecialCar(CarBrand carBrand,
                      CarEngine carEngine,
                      int issueYear,
                      CarColor carColor,
                      CarWheelSize wheelSize,
                      SpecialCarType carType,
                      boolean flashLight) {
        super(issueYear, carColor, wheelSize);
        this.carBrand = carBrand;
        this.carEngine = carEngine;
        this.carType = carType;
        this.flashLight = flashLight;
    }

    public SpecialCarType getCarType() {
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
