package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.Truck;
import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.car.enums.truckenum.LoadCapacity;

import java.util.ArrayList;
import java.util.List;

public class TruckFactory extends CarFactory {
    private List<Truck> trucksInStock;
    private final FactoryStock<Truck> truckFactoryStock;

    public TruckFactory() {
        fillStock();
        this.truckFactoryStock = new FactoryStock<>(trucksInStock);
    }

    @Override
    public Car createCar(int issueYear,
                         CarBrand carBrand,
                         CarEngine carEngine,
                         CarColor carColor,
                         CarWheelSize carWheelSize,
                         List<Options> options) {
        if (truckFactoryStock.checkCar(issueYear, carBrand, carEngine, carColor, carWheelSize, options) != null) {
            return truckFactoryStock.getClientCar();
        } else if (replaceInappropriateOptions(
                truckFactoryStock.chooseMoreSuitableCar(
                        issueYear, carBrand, carEngine, carColor, carWheelSize, options),
                issueYear, carBrand, carEngine, carColor, carWheelSize, options) != null) {
            return replaceInappropriateOptions(truckFactoryStock.getMoreSuitableCar(), issueYear,
                    carBrand, carEngine, carColor, carWheelSize, options);
        }
        return new Truck(issueYear, carBrand, carEngine, carColor, carWheelSize, options, null);
    }

    @Override
    public Car replaceInappropriateOptions(Car truck, int issueYear,
                                                        CarBrand carBrand,
                                                        CarEngine carEngine,
                                                        CarColor carColor,
                                                        CarWheelSize carWheelSize,
                                                        List<Options> options) {
        if (truck == null) return null;
        if (!(truck.getCarColor().equals(carColor))) {
            truck.setCarColor(carColor);
        }
        if (!(truck.getWheelSize().equals(carWheelSize))) {
            truck.setWheelSize(carWheelSize);
        }
        if (truck.getOptions().size() == 0
                || truck.getOptions().equals(options)) {
            truck.setOptions(options);
        }
        return truck;
    }


    @Override
    public void fillStock() {
        trucksInStock = new ArrayList<>();
        trucksInStock.add(new Truck(2023, CarBrand.VOLVO, CarEngine.COMMON_RAIL, CarColor.RED,
                CarWheelSize.LARGE, null, LoadCapacity.SMALL));
        trucksInStock.add(new Truck(2023, CarBrand.VOLVO, CarEngine.COMMON_RAIL, CarColor.WHITE,
                CarWheelSize.SMALL, null, LoadCapacity.BIG));
    }

    @Override
    public List<Truck> getCarsInStock() {
        return trucksInStock;
    }
}
