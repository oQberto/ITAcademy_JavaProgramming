package by.itacademy.homework3.car.specialcar;

import by.itacademy.homework3.car.*;

import java.util.List;

public class SpecialCar extends Car {
    private final SpecialCarType specialCarType;
    private boolean flashLight;

    public SpecialCar(CarBrand carBrand,
                      CarEngine carEngine,
                      int issueYear,
                      CarColor carColor,
                      CarWheelSize wheelSize,
                      List<Options> options,
                      SpecialCarType specialCarType,
                      boolean flashLight) {
        super(carBrand, carEngine, issueYear, carColor, wheelSize, options);
        this.specialCarType = specialCarType;
        this.flashLight = flashLight;
    }

    public SpecialCar(CarBrand carBrand,
                      CarEngine carEngine,
                      int issueYear,
                      CarColor carColor,
                      CarWheelSize wheelSize,
                      SpecialCarType specialCarType,
                      boolean flashLight) {
        super(carBrand, carEngine, issueYear, carColor, wheelSize);
        this.specialCarType = specialCarType;
        this.flashLight = flashLight;
    }

    @Override
    public String toString() {
        return "SpecialCar{ " +
                "specialCarType=" + specialCarType +
                ", flashLight=" + flashLight +
                " }";
    }

    public SpecialCarType getSpecialCarType() {
        return specialCarType;
    }

    public boolean isFlashLight() {
        return flashLight;
    }

    public void setFlashLight(boolean flashLight) {
        this.flashLight = flashLight;
    }
}
