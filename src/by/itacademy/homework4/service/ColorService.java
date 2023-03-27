package by.itacademy.homework4.service;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.markerinterfaces.Color;
import by.itacademy.homework4.validation.exception.SetArgumentException;

import static by.itacademy.homework4.messages.Message.NullMessages.*;
import static by.itacademy.homework4.validation.Validator.*;
import static java.util.Objects.*;

public class ColorService implements Changeable<Color> {
    @Override
    public void change(Car car, Color carColor) throws SetArgumentException {
        requireNonNull(car, NULL_CAR);
        requireNonNull(carColor, NULL_COLOR);
        isSetColor(car, carColor);

        if (isExistingColor(car, carColor)) {
            car.setCarColor(carColor);
        }
    }
}
