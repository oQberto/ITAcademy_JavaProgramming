package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.car.enums.specialcarenums.SpecialCarType;

import java.util.List;

public class SpecialCar extends Car {
    private SpecialCarType specialCarType;

    public SpecialCar(int issueYear,
                      CarBrand carBrand,
                      CarEngine carEngine,
                      CarColor carColor,
                      CarWheelSize carWheelSize,
                      List<Options> options,
                      SpecialCarType specialCarType) {
        super(issueYear, carBrand, carEngine, carColor, carWheelSize, options);
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

    public SpecialCarType getSpecialCarType() {
        return specialCarType;
    }
}
