package by.itacademy.homework4.factory;


import by.itacademy.homework4.car.comparators.PassengerCarComparator;
import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.PassengerCar;
import by.itacademy.homework4.car.enums.passengercarenums.*;
import by.itacademy.homework4.order.PassengerCarOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Objects.*;

public class PassengerCarFactory extends CarFactory<PassengerCar, PassengerCarOrder, PassengerCarComparator> {
    private final List<PassengerCarFuelType> passengerCarFuelTypeList;

    public PassengerCarFactory() {
        super.carBrandList = Arrays.asList(PassengerCarBrand.values());
        super.carEngineList = Arrays.asList(PassengerCarEngine.values());
        super.carColorList = Arrays.asList(PassengerCarColor.values());
        super.carWheelSizeList = Arrays.asList(PassengerCarWheelSize.values());
        this.passengerCarFuelTypeList = Arrays.asList(PassengerCarFuelType.values());
        fillStock();
        this.factoryStock = new FactoryStock<>(carsInStock, new PassengerCarComparator());
    }

    @Override
    public PassengerCar createCar(PassengerCarOrder order) {
        PassengerCar clientCar = (PassengerCar) super.createCar(order);

        if (nonNull(clientCar)) {
            return clientCar;
        } else {
            clientCar = new PassengerCar(
                    order.getIssueYear(),
                    order.getBrand(),
                    order.getEngine(),
                    order.getColor(),
                    order.getWheelSize(),
                    order.getOptions(),
                    order.getPassengerCarFuelType()
            );
        }
        return clientCar;
    }

    @Override
    protected Car replaceInappropriateOptions(PassengerCar passengerCar, PassengerCarOrder order) {
        passengerCar = (PassengerCar) super.replaceInappropriateOptions(passengerCar, order);

        if (!(passengerCar.getPassengerCarFuelType()
                .equals(order.getPassengerCarFuelType()))) {
            passengerCar.setPassengerCarFuelType(order.getPassengerCarFuelType());
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
