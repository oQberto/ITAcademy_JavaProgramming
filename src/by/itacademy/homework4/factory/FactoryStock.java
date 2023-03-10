package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.*;

import java.util.List;

public class FactoryStock<T extends Car> {
    private final List<T> carsInStock;
    private T clientCar = null;
    private T moreSuitableCar = null;

    public FactoryStock(List<T> carsInStock) {
        this.carsInStock = carsInStock;
    }

    public T checkCar(int issueYear, CarBrand carBrand, CarEngine carEngine,
                      CarColor carColor, CarWheelSize carWheelSize, List<Options> optionsList) {
        carsInStock.forEach(carFromStock -> {
            if (carFromStock.getIssueYear() == issueYear &&
                    carFromStock.getCarBrand() == carBrand &&
                    carFromStock.getCarEngine() == carEngine &&
                    carFromStock.getCarColor() == carColor &&
                    carFromStock.getWheelSize() == carWheelSize &&
                    carFromStock.getOptions() == optionsList) {
                clientCar = carFromStock;
            }
        });
        carsInStock.remove(clientCar);
        return clientCar;
    }

    public T chooseMoreSuitableCar(int issueYear, CarBrand carBrand, CarEngine carEngine,
                                   CarColor carColor, CarWheelSize carWheelSize, List<Options> optionsList) {
        carsInStock.forEach(car -> {
            if (checkImmutableParams(car, issueYear, carBrand, carEngine)) {
                moreSuitableCar = car;
            }
            if (checkImmutableParams(car, issueYear, carBrand, carEngine) &&
                    checkChangeableParams(car, carColor, carWheelSize)) {
                moreSuitableCar = car;
            }
        });
        carsInStock.remove(moreSuitableCar);
        return moreSuitableCar;
    }

    private boolean checkImmutableParams(T car, int issueYear, CarBrand carBrand, CarEngine carEngine) {
        return car.getIssueYear() == issueYear &&
                car.getCarBrand() == carBrand &&
                car.getCarEngine() == carEngine;
    }

    private boolean checkChangeableParams(T car, CarColor carColor, CarWheelSize carWheelSize) {
        if (car.getCarColor() == carColor && car.getWheelSize() == carWheelSize) {
            return true;
        } else if (car.getWheelSize() == carWheelSize) {
            return true;
        }
        return car.getCarColor() == carColor;
    }

    public void showFactoryStock() {
        carsInStock.forEach(System.out::println);
    }

    public List<T> getCarsInStock() {
        return carsInStock;
    }

    public T getClientCar() {
        return clientCar;
    }

    public T getMoreSuitableCar() {
        return moreSuitableCar;
    }
}
