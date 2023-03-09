package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.SpecialCar;

import java.util.List;

public class SpecialCarFactory extends CarFactory {

    @Override
    public Car replaceInappropriateOptions() {
        return null;
    }

    @Override
    public List<Car> getCarsInStock() {
        return null;
    }

    @Override
    public Car createCar() {
        return new SpecialCar();
    }
}
