package by.itacademy.homework4.service;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.Color;

public class ColorService implements Changeable<Color> {
    @Override
    public void change(Car car, Color carColor) {
        if (car != null && carColor != null) {
            for (Color color : car.getColors()) {
                if (color.getColorName().equals(carColor.getColorName())) {
                    car.setCarColor(carColor);
                    break;
                }
            }
        }
    }
}
