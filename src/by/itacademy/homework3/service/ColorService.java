package by.itacademy.homework3.service;

import by.itacademy.homework3.car.Car;
import by.itacademy.homework3.car.CarColor;

public class ColorService implements Changeable {
    @Override
    public void change(Car car, String carColor) {
        for (CarColor color : CarColor.values()) {
            if (carColor.equals(color.getColorName())) {
                car.setCarColor(color);
                break;
            }
        }
    }
}
