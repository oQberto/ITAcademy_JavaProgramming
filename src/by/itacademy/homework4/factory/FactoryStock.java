package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.SpecialCar;
import by.itacademy.homework4.car.Truck;
import by.itacademy.homework4.order.Order;
import by.itacademy.homework4.order.SpecialCarOrder;
import by.itacademy.homework4.order.TruckOrder;

import java.util.List;

public class FactoryStock<CAR extends Car, ORDER extends Order> {
    private final List<CAR> carsInStock;
    private CAR clientCar = null;
    private CAR moreSuitableCar = null;

    public FactoryStock(List<CAR> carsInStock) {
        this.carsInStock = carsInStock;
    }

    public CAR checkCar(ORDER order) {
        carsInStock.forEach(carFromStock -> {
            if (order.compare(carFromStock)) {
                clientCar = carFromStock;
            }
        });
        carsInStock.remove(clientCar);
        return clientCar;
    }

    public CAR chooseMoreSuitableCar(ORDER order) {
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

    private boolean checkImmutableParams(CAR car, ORDER order) {
        return car.getIssueYear() == order.getIssueYear() &&
                car.getCarBrand() == order.getBrand() &&
                car.getCarEngine() == order.getEngine();
    }

    private boolean checkChangeableParams(CAR car, ORDER order) {
        return checkIfSpecialCar(car, order)
                || checkIfTruck(car, order);
    }

    private boolean checkIfTruck(CAR car, ORDER order) {
        if (moreSuitableCar instanceof Truck) {
            if (checkGeneralChangeableParams(car, order)
                    && ((Truck) car).getLoadCapacity() == ((TruckOrder) order).getLoadCapacity()) {
                return true;
            } else {
                return checkGeneralChangeableParams(car, order);
            }
        }
        return false;
    }

    private boolean checkIfSpecialCar(CAR car, ORDER order) {
        if (moreSuitableCar instanceof SpecialCar) {
            if (checkGeneralChangeableParams(car, order)
                    && ((SpecialCar) car).getSpecialCarType() == ((SpecialCarOrder) order).getSpecialCarType()) {
                return true;
            } else {
                return checkGeneralChangeableParams(car, order);
            }
        }
        return false;
    }

    private boolean checkGeneralChangeableParams(CAR car, ORDER order) {
        if (car.getCarColor() == order.getColor() && car.getWheelSize() == order.getWheelSize()) {
            return true;
        } else if (car.getCarColor() == order.getColor()) {
            return true;
        }
        return car.getWheelSize() == order.getWheelSize();
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
