package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.specialcarenums.*;
import by.itacademy.homework4.car.markerinterfaces.*;

import java.util.List;

import static by.itacademy.homework4.messages.Message.NullMessages.*;
import static java.util.Objects.*;

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
        requireNonNull(specialCarType, NULL_SPECIAL_CAR_TYPE);
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
    public SpecialCarType getUniqueParam() {
        return specialCarType;
    }

    @Override
    public void setUniqueParam(UniqueParam uniqueParam) {
        requireNonNull(uniqueParam, NULL_LOAD_CAPACITY);
        this.specialCarType = (SpecialCarType) uniqueParam;
    }

    @Override
    public Color[] getColors() {
        return SpecialCarColor.values();
    }

    @Override
    public WheelSize[] getWheelSizes() {
        return SpecialCarWheelSize.values();
    }

}
