package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.SpecialCar;

public class SpecialCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new SpecialCar();
    }
}
