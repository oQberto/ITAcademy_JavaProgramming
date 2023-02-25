package by.itacademy.homework3.car.specialcar;

import by.itacademy.homework3.car.*;

import java.util.List;

public class SpecialCar extends Car {
    private final SpecialCarType carType;
    private final SpecialCarBrand carBrand;
    private final SpecialCarEngine carEngine;
    private boolean flashLight;

    public SpecialCar(SpecialCarBrand carBrand,
                      SpecialCarEngine carEngine,
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

    public SpecialCar(SpecialCarBrand carBrand,
                      SpecialCarEngine carEngine,
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

    public SpecialCarBrand getCarBrand() {
        return carBrand;
    }

    public SpecialCarEngine getCarEngine() {
        return carEngine;
    }

    public boolean isFlashLight() {
        return flashLight;
    }

    public void setFlashLight(boolean flashLight) {
        this.flashLight = flashLight;
    }
}
