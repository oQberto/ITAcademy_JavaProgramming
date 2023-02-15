package by.itacademy.homework3.service;

import by.itacademy.homework3.car.Car;
import by.itacademy.homework3.car.CarColor;

public class ColorService implements Changeable<CarColor> {
    @Override
    public void change(Car car, CarColor carColor) {
        for (CarColor color : CarColor.values()) {
            if (color.getColorName().equals(carColor.getColorName())) {
                car.setCarColor(carColor);
                break;
            }
        }
    }
}
