package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.*;

import java.util.List;

public class SpecialCar extends Car {
    public SpecialCar(int issueYear,
                      CarBrand carBrand,
                      CarEngine carEngine,
                      CarColor carColor,
                      CarWheelSize carWheelSize,
                      List<Options> options) {
        super(issueYear, carBrand, carEngine, carColor, carWheelSize, options);
    }
}
