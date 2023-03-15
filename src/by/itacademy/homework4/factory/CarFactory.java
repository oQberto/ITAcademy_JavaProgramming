package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.order.Order;

import java.util.List;

public abstract class CarFactory<car extends Car, order extends Order> {
    protected List<Brand> carBrandList;
    protected List<Engine> carEngineList;
    protected List<Color> carColorList;
    protected List<WheelSize> carWheelSizeList;

    public abstract Car createCar(order order);
    public abstract Car replaceInappropriateOptions(car car, order order);
    public abstract List<? extends Car> getCarsInStock();
    public abstract void fillStock();

    public void showCarBrands() {
        carBrandList.forEach(System.out::println);
    }

    public void showCarEngines() {
        carEngineList.forEach(System.out::println);
    }

    public void showCarColors() {
        carColorList.forEach(System.out::println);
    }

    public void showCarWheelSizes() {
        carWheelSizeList.forEach(System.out::println);
    }
}
