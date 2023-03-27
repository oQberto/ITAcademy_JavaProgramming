package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Truck;
import by.itacademy.homework4.car.comparators.TruckComparator;
import by.itacademy.homework4.car.enums.truckenums.*;
import by.itacademy.homework4.order.TruckOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckFactory extends CarFactory<Truck, TruckOrder, TruckComparator> {

    public TruckFactory() {
        super.carBrandList = Arrays.asList(TruckBrand.values());
        super.carEngineList = Arrays.asList(TruckEngine.values());
        super.carColorList = Arrays.asList(TruckColor.values());
        super.carWheelSizeList = Arrays.asList(TruckWheelSize.values());
        fillStock();
        this.factoryStock = new FactoryStock<>(carsInStock, new TruckComparator());
    }

    @Override
    public Truck createCar(TruckOrder order) {
        Truck clientTruck = (Truck) super.createCar(order);

        if (clientTruck != null) {
            return clientTruck;
        } else {
            clientTruck = new Truck(
                    order.getIssueYear(),
                    order.getBrand(),
                    order.getEngine(),
                    order.getColor(),
                    order.getWheelSize(),
                    order.getOptions(),
                    order.getLoadCapacity()
            );
        }
        return clientTruck;
    }

    @Override
    protected Truck replaceInappropriateOptions(Truck truck, TruckOrder order) {
        truck = (Truck) super.replaceInappropriateOptions(truck, order);

        if (!(truck.getLoadCapacity()
                == (order.getLoadCapacity()))) {
            truck.setLoadCapacity(order.getLoadCapacity());
        }
        return truck;
    }

    @Override
    protected void fillStock() {
        carsInStock = new ArrayList<>();
        carsInStock.add(new Truck(2023, TruckBrand.NISSAN, TruckEngine.COMMON_RAIL, TruckColor.RED,
                TruckWheelSize.LARGE, null, 15));
        carsInStock.add(new Truck(2022, TruckBrand.VOLVO, TruckEngine.COMMON_RAIL, TruckColor.RED,
                TruckWheelSize.LARGE, null, 14));
        carsInStock.add(new Truck(2023, TruckBrand.NISSAN, TruckEngine.COMMON_RAIL, TruckColor.WHITE,
                TruckWheelSize.SMALL, null, 13));
    }

    @Override
    public void showFactoryCatalogue() {
        super.showFactoryCatalogue();
    }

    @Override
    public List<Truck> getCarsInStock() {
        return carsInStock;
    }
}
