package by.itacademy.homework3.carFactory;

import by.itacademy.homework3.car.*;
import by.itacademy.homework3.carShowroom.Order;

import java.util.List;

public class FactoryStock<T extends Car> {
    private final List<T> cars;
    private T carFromStock = null;
    private T moreSuitableCar = null;

    public FactoryStock(List<T> cars) {
        this.cars = cars;
    }

    public T checkCar(Order order) {
        if (order == null) return null;
//        T clientCar = null;
        for (T car : cars) {
            if (order.equals(car)) {
                carFromStock = car;
            }
        }
        cars.remove(carFromStock);
        return carFromStock;
    }

    public T chooseMoreSuitableCar(Order order) {
        if (order == null) return null;

        for (T car : cars) {
            if (checkImmutableParams(car, order)) {
                moreSuitableCar = car;
            }
            if (checkImmutableParams(car, order)
                    && checkChangeableParams(car, order)) {
                moreSuitableCar = car;
            }
        }
        cars.remove(moreSuitableCar);
        return moreSuitableCar;
    }

    private boolean checkImmutableParams(T car, Order order) {
        return car.getCarBrand().equals(order.getCarBrand())
                && car.getCarEngine().equals(order.getCarEngine())
                && car.getIssueYear() == order.getIssueYear()
                && car.getCarType() == order.getCarType();
    }

    private boolean checkChangeableParams(T car, Order order) {
        if (car.getCarColor().equals(order.getCarColor())
                && car.getWheelSize().equals(order.getWheelSize())) {
            return true;
        }
        return car.getCarColor().equals(order.getCarColor());
    }

    public void showFactoryStock() {
        for (T car : cars) {
            System.out.println(car);
        }
    }

    public List<T> getCars() {
        return cars;
    }

    public T getCarFromStock() {
        return carFromStock;
    }

    public T getMoreSuitableCar() {
        return moreSuitableCar;
    }
}
