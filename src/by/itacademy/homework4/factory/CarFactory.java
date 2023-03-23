package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.markerinterfaces.Brand;
import by.itacademy.homework4.car.markerinterfaces.Color;
import by.itacademy.homework4.car.markerinterfaces.Engine;
import by.itacademy.homework4.car.markerinterfaces.WheelSize;
import by.itacademy.homework4.order.Order;

import static by.itacademy.homework4.validation.Message.NullMessages.*;

import static java.util.Objects.*;

import java.util.List;
import java.util.Objects;

public abstract class CarFactory<CAR extends Car, ORDER extends Order> {
    protected List<CAR> carsInStock;
    protected FactoryStock<CAR, ORDER> factoryStock;
    protected List<Brand> carBrandList;
    protected List<Engine> carEngineList;
    protected List<Color> carColorList;
    protected List<WheelSize> carWheelSizeList;

    public Car createCar(ORDER order) {
        requireNonNull(order, NULL_ORDER);

        if (nonNull(factoryStock.checkCar(order))) {
            return factoryStock.getClientCar();
        } else if (nonNull(
                replaceInappropriateOptions(
                        factoryStock.chooseMoreSuitableCar(order),
                        order))
        ) {
            return replaceInappropriateOptions(
                    factoryStock.getMoreSuitableCar(),
                    order);
        }
        return null;
    }

    public abstract List<? extends Car> getCarsInStock();

    protected Car replaceInappropriateOptions(CAR car, ORDER order) {
        requireNonNull(car, NULL_CAR);
        requireNonNull(order, NULL_ORDER);

        if (!Objects.equals(
                        car.getCarColor(),
                        order.getColor()
        )) {
            car.setCarColor(order.getColor());
        }
        if (!Objects.equals(
                        car.getWheelSize(),
                        order.getWheelSize()
        )) {
            car.setWheelSize(order.getWheelSize());
        }
        if (isNull(car.getOptions()) ||
                Objects.equals(
                                car.getOptions(),
                                order.getOptions()
                )) {
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
