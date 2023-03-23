package by.itacademy.homework4.service;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.WheelSize;

import static by.itacademy.homework4.validation.Validator.*;
import static by.itacademy.homework4.validation.Message.NullMessages.*;

import static java.util.Objects.*;

public class WheelService implements Changeable<WheelSize> {
    @Override
    public void change(Car car, WheelSize carWheel) {
        requireNonNull(car, NULL_CAR);
        requireNonNull(carWheel, NULL_WHEEL_SIZE);

        if (isExistingWheelSize(car, carWheel)) {
            car.setWheelSize(carWheel);
        }
    }
}