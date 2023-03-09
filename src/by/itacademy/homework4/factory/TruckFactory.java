package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.Truck;

public class TruckFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new Truck();
    }
}
