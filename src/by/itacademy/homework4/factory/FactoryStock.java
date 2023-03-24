package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.order.Order;

import static by.itacademy.homework4.messages.Message.NullMessages.*;

import static java.util.Objects.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FactoryStock<CAR extends Car, ORDER extends Order> {
    private final List<CAR> carsInStock;
    private CAR clientCar = null;
    private CAR moreSuitableCar = null;

    public FactoryStock(List<CAR> carsInStock) {
        this.carsInStock =
                carsInStock == null
                        ? new ArrayList<>()
                        : carsInStock;
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
                    if (checkImmutableParams(car, order)) {
                        moreSuitableCar = car;
                    }
                    if (checkImmutableParams(car, order) &&
                            checkChangeableParams(car, order)) {
                        moreSuitableCar = car;
                    }
                });
        carsInStock.remove(moreSuitableCar);
        return moreSuitableCar;
    }

    private boolean checkImmutableParams(CAR car, ORDER order) {
        requireNonNull(car, NULL_CAR);

        return car.getIssueYear() == order.getIssueYear() &&
                car.getCarBrand() == order.getBrand() &&
                car.getCarEngine() == order.getEngine();
    }

    private boolean checkChangeableParams(CAR car, ORDER order) {
        requireNonNull(car, NULL_CAR);

        return (checkGeneralChangeableParams(car, order) &&
                Objects.equals(
                        car.getUniqueParam(),
                        order.getUniqueParam())) ||
                checkGeneralChangeableParams(car, order);
    }


    private boolean checkGeneralChangeableParams(CAR car, ORDER order) {
        if (Objects.equals(car.getCarColor(), order.getColor()) &&
                Objects.equals(car.getWheelSize(), order.getWheelSize())
        ) {
            return true;
        } else if (Objects.equals(
                car.getCarColor(),
                order.getColor()
        )) {
            return true;
        }
        return Objects
                .equals(
                        car.getWheelSize(),
                        order.getWheelSize()
                );
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
