package by.itacademy.homework4.service;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.Color;

import static by.itacademy.homework4.validation.Message.NullMessages.*;
import static by.itacademy.homework4.validation.Validator.*;
import static java.util.Objects.*;

public class ColorService implements Changeable<Color> {
    @Override
    public void change(Car car, Color carColor) {
        requireNonNull(car, NULL_CAR);
        requireNonNull(carColor, NULL_COLOR);

        if (isExistingColor(car, carColor)) {
            car.setCarColor(carColor);
        }
    }
}
