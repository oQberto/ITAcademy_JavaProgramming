package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.car.enums.specialcarenums.*;

import java.util.List;

public class SpecialCar extends Car {
    private SpecialCarType specialCarType;

    public SpecialCar(int issueYear,
                      Brand carBrand,
                      Engine carEngine,
                      Color carColor,
                      WheelSize wheelSize,
                      List<Option> options,
                      SpecialCarType specialCarType) {
        super(issueYear, carBrand, carEngine, carColor, wheelSize, options);
        this.specialCarType = specialCarType;
    }

    @Override
    public String toString() {
        return "SpecialCar{" +
                "issueYear=" + issueYear +
                ", carBrand=" + carBrand +
                ", carEngine=" + carEngine +
                ", carColor=" + carColor +
                ", wheelSize=" + wheelSize +
                ", options=" + options +
                ", carType=" + specialCarType +
                '}';
    }

    @Override
    public UniqueParam getUniqueParam() {
        return specialCarType;
    }

    @Override
    public Color[] getColors() {
        return SpecialCarColor.values();
    }

    @Override
    public WheelSize[] getWheelSizes() {
        return SpecialCarWheelSize.values();
    }

    public SpecialCarType getSpecialCarType() {
        return specialCarType;
    }

    public void setSpecialCarType(SpecialCarType specialCarType) {
        this.specialCarType = specialCarType;
    }
}
