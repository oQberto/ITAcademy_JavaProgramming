package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.SpecialCar;
import by.itacademy.homework4.car.Truck;
import by.itacademy.homework4.order.Order;
import by.itacademy.homework4.order.SpecialCarOrder;
import by.itacademy.homework4.order.TruckOrder;

import java.util.List;

public class FactoryStock<car extends Car, order extends Order> {
    private final List<car> carsInStock;
    private car clientCar = null;
    private car moreSuitableCar = null;

    public FactoryStock(List<car> carsInStock) {
        this.carsInStock = carsInStock;
    }

    public car checkCar(order order) {
        carsInStock.forEach(carFromStock -> {
            if (order.compare(carFromStock)) {
                clientCar = carFromStock;
            }
        });
        carsInStock.remove(clientCar);
        return clientCar;
    }

    public car chooseMoreSuitableCar(order order) {
        carsInStock.forEach(car -> {
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

    private boolean checkImmutableParams(car car, order order) {
        return car.getIssueYear() == order.getIssueYear() &&
                car.getCarBrand() == order.getBrand() &&
                car.getCarEngine() == order.getEngine();
    }

    private boolean checkChangeableParams(car car, order order) {
        return checkIfSpecialCar(car, order)
                || checkIfTruck(car, order);
    }

    private boolean checkIfTruck(car car, order order) {
        if (moreSuitableCar instanceof Truck) {
            if (car.getCarColor() == order.getColor() && car.getWheelSize() == order.getWheelSize()
                    && ((Truck) car).getLoadCapacity() == ((TruckOrder) order).getLoadCapacity()) {
                return true;
            } else {
                return checkGeneralChangeableParams(car, order);
            }
        }
        return false;
    }

    private boolean checkIfSpecialCar(car car, order order) {
        if (moreSuitableCar instanceof SpecialCar) {
            if (car.getCarColor() == order.getColor() && car.getWheelSize() == order.getWheelSize()
                    && ((SpecialCar) car).getSpecialCarType() == ((SpecialCarOrder) order).getSpecialCarType()) {
                return true;
            } else {
                return checkGeneralChangeableParams(car, order);
            }
        }
        return false;
    }

    private boolean checkGeneralChangeableParams(car car, order order) {
        if (car.getCarColor() == order.getColor() && car.getWheelSize() == order.getWheelSize()) {
            return true;
        }
        else return car.getWheelSize() == order.getWheelSize();
    }

    public void showFactoryStock() {
        carsInStock.forEach(System.out::println);
    }

    public List<car> getCarsInStock() {
        return carsInStock;
    }

    public car getClientCar() {
        return clientCar;
    }

    public car getMoreSuitableCar() {
        return moreSuitableCar;
    }
}
