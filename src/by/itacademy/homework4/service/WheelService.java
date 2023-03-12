package by.itacademy.homework4.service;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.WheelSize;

public class WheelService implements Changeable<WheelSize> {
    @Override
    public void change(Car car, WheelSize carWheel) {
        if (car != null && carWheel != null) {
            for (WheelSize carWheelSize : car.getWheelSizes()) {
                if (carWheelSize.getWheelDiameter() == carWheel.getWheelDiameter()) {
                    car.setWheelSize(carWheel);
                    break;
                }
            }
        }
    }
}