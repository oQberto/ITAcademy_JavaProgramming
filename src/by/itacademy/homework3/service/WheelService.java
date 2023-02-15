package by.itacademy.homework3.service;

import by.itacademy.homework3.car.Car;
import by.itacademy.homework3.car.CarWheelSize;

public class WheelService implements Changeable {
    @Override
    public void change(Car car, String carWheel) {
        for (CarWheelSize carWheelSize : CarWheelSize.values()) {
            if (carWheelSize.getWheelDiameter() == Integer.parseInt(carWheel)) {
                car.setWheelSize(carWheelSize);
            }
        }
    }
}
