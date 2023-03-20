package by.itacademy.homework4.service;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.WheelSize;

import static by.itacademy.homework4.validation.Validator.*;

public class WheelService implements Changeable<WheelSize> {
    @Override
    public void change(Car car, WheelSize carWheel) {
        isNullCar(car);
        isNullWheelSize(carWheel);

        if (isExistingWheelSize(car, carWheel)) {
            car.setWheelSize(carWheel);
        }
    }
}