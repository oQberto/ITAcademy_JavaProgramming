package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.Truck;

import java.util.List;

public class TruckFactory extends CarFactory {

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
        return new Truck();
    }
}
