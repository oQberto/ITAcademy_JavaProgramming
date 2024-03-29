package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.SpecialCar;
import by.itacademy.homework4.car.comparators.SpecialCarComparator;
import by.itacademy.homework4.car.enums.specialcarenums.*;
import by.itacademy.homework4.order.SpecialCarOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Objects.*;

public class SpecialCarFactory extends CarFactory<SpecialCar, SpecialCarOrder, SpecialCarComparator> {
    private final List<SpecialCarType> specialCarTypeList;

    public SpecialCarFactory() {
        super.carBrandList = Arrays.asList(SpecialCarBrand.values());
        super.carEngineList = Arrays.asList(SpecialCarEngine.values());
        super.carColorList = Arrays.asList(SpecialCarColor.values());
        super.carWheelSizeList = Arrays.asList(SpecialCarWheelSize.values());
        this.specialCarTypeList = Arrays.asList(SpecialCarType.values());
        fillStock();
        this.factoryStock = new FactoryStock<>(carsInStock, new SpecialCarComparator());
    }

    @Override
    public SpecialCar createCar(SpecialCarOrder order) {
        SpecialCar clientCar = (SpecialCar) super.createCar(order);

        if (nonNull(clientCar)) {
            return clientCar;
        } else {
            clientCar = new SpecialCar(
                    order.getIssueYear(),
                    order.getBrand(),
                    order.getEngine(),
                    order.getColor(),
                    order.getWheelSize(),
                    order.getOptions(),
                    order.getSpecialCarType()
            );
        }
        return clientCar;
    }


    @Override
    protected SpecialCar replaceInappropriateOptions(SpecialCar specialCar, SpecialCarOrder order) {
        specialCar = (SpecialCar) super.replaceInappropriateOptions(specialCar, order);

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
                SpecialCarWheelSize.LARGE, null, SpecialCarType.AMBULANCE));
        carsInStock.add(new SpecialCar(2022, SpecialCarBrand.VOLVO, SpecialCarEngine.COMMON_RAIL, SpecialCarColor.RED,
                SpecialCarWheelSize.MIDDLE, null, SpecialCarType.POLICE));
        carsInStock.add(new SpecialCar(2023, SpecialCarBrand.FORD, SpecialCarEngine.COMMON_RAIL, SpecialCarColor.GREEN,
                SpecialCarWheelSize.SMALL, null, SpecialCarType.POLICE));
    }

    @Override
    public void showFactoryCatalogue() {
        super.showFactoryCatalogue();

        System.out.println("Special car types: ");
        specialCarTypeList.forEach(System.out::println);
    }

    @Override
    public List<SpecialCar> getCarsInStock() {
        return carsInStock;
    }
}
