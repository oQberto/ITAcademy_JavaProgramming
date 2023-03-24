package by.itacademy.homework4.factory;


import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.PassengerCar;
import by.itacademy.homework4.car.enums.passengercarenums.*;
import by.itacademy.homework4.order.PassengerCarOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassengerCarFactory extends CarFactory<PassengerCar, PassengerCarOrder> {
    private final List<PassengerCarFuelType> passengerCarFuelTypeList;

    public PassengerCarFactory() {
        super.carBrandList = Arrays.asList(PassengerCarBrand.values());
        super.carEngineList = Arrays.asList(PassengerCarEngine.values());
        super.carColorList = Arrays.asList(PassengerCarColor.values());
        super.carWheelSizeList = Arrays.asList(PassengerCarWheelSize.values());
        this.passengerCarFuelTypeList = Arrays.asList(PassengerCarFuelType.values());
        fillStock();
        this.factoryStock = new FactoryStock<>(carsInStock);
    }

    @Override
    public PassengerCar createCar(PassengerCarOrder order) {
        super.createCar(order);

        return new PassengerCar(
                order.getIssueYear(),
                order.getBrand(),
                order.getEngine(),
                order.getColor(),
                order.getWheelSize(),
                order.getOptions(),
                order.getUniqueParam());
    }

    @Override
    protected Car replaceInappropriateOptions(PassengerCar passengerCar, PassengerCarOrder order) {
        passengerCar = (PassengerCar) super.replaceInappropriateOptions(passengerCar, order);

        if (!(passengerCar.getUniqueParam()
                .equals(order.getUniqueParam()))) {
            passengerCar.setUniqueParam(order.getUniqueParam());
        }
        return passengerCar;
    }

    @Override
    void fillStock() {
        carsInStock = new ArrayList<>();
        carsInStock.add(new PassengerCar(2023, PassengerCarBrand.FORD, PassengerCarEngine.COMMON_RAIL, PassengerCarColor.RED,
                PassengerCarWheelSize.LARGE, null, PassengerCarFuelType.CNG));
    }

    @Override
    public void showFactoryCatalogue() {
        super.showFactoryCatalogue();

        System.out.println("Passenger car fuel types: ");
        passengerCarFuelTypeList.forEach(System.out::println);
    }

    @Override
    public List<PassengerCar> getCarsInStock() {
        return carsInStock;
    }
}
