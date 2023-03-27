package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.comparators.Comparator;
import by.itacademy.homework4.order.Order;

import static by.itacademy.homework4.messages.Message.NullMessages.*;

import static java.util.Objects.*;

import java.util.ArrayList;
import java.util.List;

public class FactoryStock<CAR extends Car, ORDER extends Order, COMPARATOR extends Comparator> {
    private final List<CAR> carsInStock;
    private CAR clientCar = null;
    private CAR moreSuitableCar = null;
    private final COMPARATOR comparator;

    public FactoryStock(List<CAR> carsInStock, COMPARATOR comparator) {
        this.carsInStock =
                carsInStock == null
                        ? new ArrayList<>()
                        : carsInStock;
        this.comparator = comparator;
    }

    public CAR checkCar(ORDER order) {
        requireNonNull(order, NULL_ORDER);

        carsInStock
                .forEach(carFromStock -> {
                    if (order.compare(carFromStock)) {
                        clientCar = carFromStock;
                    }
                });
        carsInStock.remove(clientCar);
        return clientCar;
    }

    public CAR chooseMoreSuitableCar(ORDER order) {
        requireNonNull(order, NULL_ORDER);

        carsInStock
                .forEach(car -> {
                    if (comparator.compare(car, order)) {
                        moreSuitableCar = car;
                    }
                });
        carsInStock.remove(moreSuitableCar);
        return moreSuitableCar;
    }

    public void showFactoryStock() {
        carsInStock.forEach(System.out::println);
    }

    public List<CAR> getCarsInStock() {
        return carsInStock;
    }

    public CAR getClientCar() {
        return clientCar;
    }

    public CAR getMoreSuitableCar() {
        return moreSuitableCar;
    }
}
