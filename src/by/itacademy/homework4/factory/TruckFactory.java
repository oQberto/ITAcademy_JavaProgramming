package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.Truck;
import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.car.enums.truckenum.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckFactory extends CarFactory {
    private List<Truck> trucksInStock;
    private final FactoryStock<Truck> truckFactoryStock;

    public TruckFactory() {
        super.carBrandList = Arrays.asList(TruckCarBrand.values());
        super.carEngineList = Arrays.asList(TruckCarEngine.values());
        super.carColorList = Arrays.asList(TruckCarColor.values());
        super.carWheelSizeList = Arrays.asList(TruckCarWheelSize.values());
        fillStock();
        this.truckFactoryStock = new FactoryStock<>(trucksInStock);
    }

    @Override
    public Truck createCar(int issueYear,
                         Brand carBrand,
                         Engine carEngine,
                         Color carColor,
                         WheelSize carWheelSize,
                         List<IOptions> options) {
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
    public Truck replaceInappropriateOptions(Car truck,
                                           int issueYear,
                                           Brand carBrand,
                                           Engine carEngine,
                                           Color carColor,
                                           WheelSize carWheelSize,
                                           List<IOptions> options) {
        if (truck == null) return null;
        if (!(truck.getCarColor().equals(carColor))) {
            truck.setCarColor(carColor);
        }
        if (!(truck.getWheelSize().equals(carWheelSize))) {
            truck.setWheelSize(carWheelSize);
        }
        if (truck.getOptions() == null
                || truck.getOptions().equals(options)) {
            truck.setOptions(options);
        }
        return (Truck) truck;
    }


    @Override
    public void fillStock() {
        trucksInStock = new ArrayList<>();
        trucksInStock.add(new Truck(2023, TruckCarBrand.VOLVO, TruckCarEngine.COMMON_RAIL, TruckCarColor.RED,
                TruckCarWheelSize.LARGE, null, LoadCapacity.SMALL));
        trucksInStock.add(new Truck(2023, TruckCarBrand.VOLVO, TruckCarEngine.COMMON_RAIL, TruckCarColor.WHITE,
                TruckCarWheelSize.SMALL, null, LoadCapacity.BIG));
    }

    @Override
    public List<Truck> getCarsInStock() {
        return trucksInStock;
    }
}
