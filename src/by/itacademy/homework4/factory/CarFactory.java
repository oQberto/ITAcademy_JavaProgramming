package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.order.Order;

import java.util.List;

public abstract class CarFactory<CAR extends Car, ORDER extends Order> {
    protected List<Brand> carBrandList;
    protected List<Engine> carEngineList;
    protected List<Color> carColorList;
    protected List<WheelSize> carWheelSizeList;

    public abstract Car createCar(ORDER order);
    public abstract List<? extends Car> getCarsInStock();
    abstract Car replaceInappropriateOptions(CAR car, ORDER order);
    abstract void fillStock();

    public void showFactoryCatalogue() {
        System.out.println("Brands: ");
        carBrandList.forEach(System.out::println);

        System.out.println("Engines: ");
        carEngineList.forEach(System.out::println);

        System.out.println("Coors: ");
        carColorList.forEach(System.out::println);

        System.out.println("Wheel sizes: ");
        carWheelSizeList.forEach(System.out::println);
    }
}
