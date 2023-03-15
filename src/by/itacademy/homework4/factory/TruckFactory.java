package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Truck;
import by.itacademy.homework4.car.enums.truckenums.*;
import by.itacademy.homework4.order.TruckOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckFactory extends CarFactory<Truck, TruckOrder> {
    private List<Truck> trucksInStock;
    private final FactoryStock<Truck, TruckOrder> truckFactoryStock;

    public TruckFactory() {
        super.carBrandList = Arrays.asList(TruckBrand.values());
        super.carEngineList = Arrays.asList(TruckEngine.values());
        super.carColorList = Arrays.asList(TruckColor.values());
        super.carWheelSizeList = Arrays.asList(TruckWheelSize.values());
        fillStock();
        this.truckFactoryStock = new FactoryStock<>(trucksInStock);
    }

    @Override
    public Truck createCar(TruckOrder order) {
        if (truckFactoryStock.
                checkCar(order) != null) {
            return truckFactoryStock.getClientCar();
        } else if (replaceInappropriateOptions(truckFactoryStock
                        .chooseMoreSuitableCar(order), order) != null) {
            return replaceInappropriateOptions(truckFactoryStock.getMoreSuitableCar(), order);
        }
        return new Truck(
                order.getIssueYear(),
                order.getBrand(),
                order.getEngine(),
                order.getColor(),
                order.getWheelSize(),
                order.getOptions(),
                order.getLoadCapacity()
        );
    }

    @Override
    public Truck replaceInappropriateOptions(Truck truck, TruckOrder order) {
        if (truck == null) return null;
        if (!(truck.getCarColor()
                .equals(order.getColor()))) {
            truck.setCarColor(order.getColor());
        }
        if (!(truck.getWheelSize()
                .equals(order.getWheelSize()))) {
            truck.setWheelSize(order.getWheelSize());
        }
        if (truck.getOptions() == null
                || truck.getOptions().equals(order.getOptions())) {
            truck.setOptions(order.getOptions());
        }
        if (!(truck.getLoadCapacity()
                .equals(order.getLoadCapacity()))) {
            truck.setLoadCapacity(order.getLoadCapacity());
        }
        return truck;
    }


    @Override
    public void fillStock() {
        trucksInStock = new ArrayList<>();
        trucksInStock.add(new Truck(2023, TruckBrand.VOLVO, TruckEngine.COMMON_RAIL, TruckColor.RED,
                TruckWheelSize.LARGE, null, LoadCapacity.SMALL));
        trucksInStock.add(new Truck(2022, TruckBrand.VOLVO, TruckEngine.COMMON_RAIL, TruckColor.RED,
                TruckWheelSize.LARGE, null, LoadCapacity.SMALL));
        trucksInStock.add(new Truck(2023, TruckBrand.NISSAN, TruckEngine.COMMON_RAIL, TruckColor.WHITE,
                TruckWheelSize.SMALL, null, LoadCapacity.BIG));
    }

    @Override
    public List<Truck> getCarsInStock() {
        return trucksInStock;
    }
}
