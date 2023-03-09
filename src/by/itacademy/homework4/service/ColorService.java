package by.itacademy.homework4.service;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.CarColor;

public class ColorService implements Changeable<CarColor> {
    @Override
    public void change(Car car, CarColor carColor) {
        if (car != null && carColor != null) {
            for (CarColor color : CarColor.values()) {
                if (color.getColorName().equals(carColor.getColorName())) {
                    car.setCarColor(carColor);
                    break;
                }
            }
        }
    }
}
