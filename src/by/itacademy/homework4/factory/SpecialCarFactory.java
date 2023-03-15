package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.SpecialCar;
import by.itacademy.homework4.car.enums.specialcarenums.*;
import by.itacademy.homework4.order.SpecialCarOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialCarFactory extends CarFactory<SpecialCar, SpecialCarOrder> {
    private List<SpecialCar> carsInStock;
    private final FactoryStock<SpecialCar, SpecialCarOrder> specialCarFactoryStock;

    public SpecialCarFactory() {
        super.carBrandList = Arrays.asList(SpecialCarBrand.values());
        super.carEngineList = Arrays.asList(SpecialCarEngine.values());
        super.carColorList = Arrays.asList(SpecialCarColor.values());
        super.carWheelSizeList = Arrays.asList(SpecialCarWheelSize.values());
        fillStock();
        this.specialCarFactoryStock = new FactoryStock<>(carsInStock);
    }

    @Override
    public Car createCar(SpecialCarOrder order) {
        if (specialCarFactoryStock
                .checkCar(order) != null) {
            return specialCarFactoryStock.getClientCar();
        } else if (replaceInappropriateOptions(specialCarFactoryStock
                .chooseMoreSuitableCar(order), order) != null) {
            return replaceInappropriateOptions(specialCarFactoryStock.getMoreSuitableCar(), order);
        }
        return new SpecialCar(
                order.getIssueYear(),
                order.getBrand(),
                order.getEngine(),
                order.getColor(),
                order.getWheelSize(),
                order.getOptions(),
                order.getSpecialCarType());
    }

    @Override
    protected Car replaceInappropriateOptions(SpecialCar specialCar, SpecialCarOrder order) {
        if (!(specialCar.getCarColor()
                .equals(order.getColor()))) {
            specialCar.setCarColor(order.getColor());
        }
        if (!(specialCar.getWheelSize()
                .equals(order.getWheelSize()))) {
            specialCar.setWheelSize(order.getWheelSize());
        }
        if (specialCar.getOptions() == null
                || specialCar.getOptions().equals(order.getOptions())) {
            specialCar.setOptions(order.getOptions());
        }
        if (!(specialCar.getSpecialCarType()
                .equals(order.getSpecialCarType()))) {
            specialCar.setSpecialCarType(order.getSpecialCarType());
        }
        return specialCar;
    }

    @Override
    protected void fillStock() {
        carsInStock = new ArrayList<>();
        carsInStock.add(new SpecialCar(2023, SpecialCarBrand.FORD, SpecialCarEngine.COMMON_RAIL, SpecialCarColor.BLACK,
                SpecialCarWheelSize.MIDDLE, null, null));
    }

    @Override
    public List<SpecialCar> getCarsInStock() {
        return carsInStock;
    }
}
