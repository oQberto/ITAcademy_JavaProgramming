package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Truck;
import by.itacademy.homework4.car.enums.truckenums.*;
import by.itacademy.homework4.order.TruckOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckFactory extends CarFactory<Truck, TruckOrder> {
    private final List<LoadCapacity> loadCapacityList;

    public TruckFactory() {
        super.carBrandList = Arrays.asList(TruckBrand.values());
        super.carEngineList = Arrays.asList(TruckEngine.values());
        super.carColorList = Arrays.asList(TruckColor.values());
        super.carWheelSizeList = Arrays.asList(TruckWheelSize.values());
        this.loadCapacityList = Arrays.asList(LoadCapacity.values());
        fillStock();
        this.factoryStock = new FactoryStock<>(carsInStock);
    }

    @Override
    public Truck createCar(TruckOrder order) {
        super.createCar(order);

        return new Truck(
                order.getIssueYear(),
                order.getBrand(),
                order.getEngine(),
                order.getColor(),
                order.getWheelSize(),
                order.getOptions(),
                (LoadCapacity) order.getUniqueParam()
        );
    }

    @Override
    protected Truck replaceInappropriateOptions(Truck truck, TruckOrder order) {
        truck = (Truck) super.replaceInappropriateOptions(truck, order);

        if (!(truck.getLoadCapacity()
                .equals(order.getUniqueParam()))) {
            truck.setLoadCapacity((LoadCapacity) order.getUniqueParam());
        }
        return truck;
    }

    @Override
    protected void fillStock() {
        carsInStock = new ArrayList<>();
        carsInStock.add(new Truck(2023, TruckBrand.VOLVO, TruckEngine.COMMON_RAIL, TruckColor.RED,
                TruckWheelSize.LARGE, null, LoadCapacity.SMALL));
        carsInStock.add(new Truck(2022, TruckBrand.VOLVO, TruckEngine.COMMON_RAIL, TruckColor.RED,
                TruckWheelSize.LARGE, null, LoadCapacity.SMALL));
        carsInStock.add(new Truck(2023, TruckBrand.NISSAN, TruckEngine.COMMON_RAIL, TruckColor.WHITE,
                TruckWheelSize.SMALL, null, LoadCapacity.BIG));
    }

    @Override
    public void showFactoryCatalogue() {
        super.showFactoryCatalogue();

        System.out.println("Load capacity: ");
        loadCapacityList.forEach(System.out::println);
    }

    @Override
    public List<Truck> getCarsInStock() {
        return carsInStock;
    }
}
