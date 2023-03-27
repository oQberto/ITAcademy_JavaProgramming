package by.itacademy.homework4.service;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.markerinterfaces.WheelSize;
import by.itacademy.homework4.validation.exception.SetArgumentException;

import static by.itacademy.homework4.validation.Validator.*;
import static by.itacademy.homework4.messages.Message.NullMessages.*;

import static java.util.Objects.*;

public class WheelService implements Changeable<WheelSize> {
    @Override
    public void change(Car car, WheelSize carWheel) throws SetArgumentException {
        requireNonNull(car, NULL_CAR);
        requireNonNull(carWheel, NULL_WHEEL_SIZE);
        isSetWheelSize(car, carWheel);

        if (isExistingWheelSize(car, carWheel)) {
            car.setWheelSize(carWheel);
        }
    }
}