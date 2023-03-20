package by.itacademy.homework4.service;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.Color;

import static by.itacademy.homework4.validation.Validator.*;

public class ColorService implements Changeable<Color> {
    @Override
    public void change(Car car, Color carColor) {
        isNullCar(car);
        isNullColor(carColor);

        for (Color color : car.getColors()) {
            if (color == carColor) {
                car.setCarColor(carColor);
                break;
            }
        }
    }
}
