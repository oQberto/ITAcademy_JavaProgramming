package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.order.Order;

import java.util.List;

public abstract class CarFactory<CAR extends Car, ORDER extends Order> {
    protected List<CAR> carsInStock;
    protected FactoryStock<CAR, ORDER> factoryStock;
    protected List<Brand> carBrandList;
    protected List<Engine> carEngineList;
    protected List<Color> carColorList;
    protected List<WheelSize> carWheelSizeList;

    public Car createCar(ORDER order) {
        if (factoryStock.
                checkCar(order) != null) {
            return factoryStock.getClientCar();
        } else if (replaceInappropriateOptions(factoryStock
                .chooseMoreSuitableCar(order), order) != null) {
            return replaceInappropriateOptions(factoryStock.getMoreSuitableCar(), order);
        }
        return null;
    }
    public abstract List<? extends Car> getCarsInStock();
    protected Car replaceInappropriateOptions(CAR car, ORDER order) {
        if (!(car.getCarColor()
                .equals(order.getColor()))) {
            car.setCarColor(order.getColor());
        }
        if (!(car.getWheelSize()
                .equals(order.getWheelSize()))) {
            car.setWheelSize(order.getWheelSize());
        }
        if (car.getOptions() == null
                || car.getOptions().equals(order.getOptions())) {
            car.setOptions(order.getOptions());
        }
        return car;
    }
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
