package by.itacademy.homework3.service;

import by.itacademy.homework3.car.Car;
import by.itacademy.homework3.car.CarWheelSize;

public class WheelService implements Changeable<CarWheelSize> {
    @Override
    public void change(Car car, CarWheelSize carWheel) {
        for (CarWheelSize carWheelSize : CarWheelSize.values()) {
            if (carWheelSize.getWheelDiameter() == carWheel.getWheelDiameter()) {
                car.setWheelSize(carWheel);
                break;
            }
        }
    }
}