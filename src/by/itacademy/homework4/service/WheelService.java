package by.itacademy.homework4.service;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.WheelSize;

public class WheelService implements Changeable<WheelSize> {
    @Override
    public void change(Car car, WheelSize carWheel) {
        if (car != null && carWheel != null) {
            for (WheelSize wheelSize : car.getWheelSizes()) {
                if (wheelSize == carWheel) {
                    car.setWheelSize(carWheel);
                    break;
                }
            }
        }
    }
}