package by.itacademy.homework3.carFactory.specialcarsfactory;

import by.itacademy.homework3.car.*;
import by.itacademy.homework3.car.specialcar.*;
import by.itacademy.homework3.carFactory.*;
import by.itacademy.homework3.carShowroom.Order;

import java.util.ArrayList;
import java.util.List;

public class SpecialCarsFactory extends CarFactory<SpecialCar> {
    private List<SpecialCar> carsInStock;
    private final FactoryStock<SpecialCar> factoryStock;

    public SpecialCarsFactory() {
        fillStock();
        this.factoryStock = new FactoryStock<>(carsInStock);
    }

    @Override
    public SpecialCar createCar(Order order) {
        if (order == null) return null;
        if (factoryStock.checkCar(order) != null) {
            return factoryStock.getCarFromStock();
        } else if (replaceInappropriateOptions
                (factoryStock.chooseMoreSuitableCar(order), order) != null){
            return replaceInappropriateOptions(
                    factoryStock.getMoreSuitableCar(), order
            );
        }
        return new SpecialCar(order.getCarType(),
                order.getCarBrand(),
                order.getCarEngine(),
                order.getIssueYear(),
                order.getCarColor(),
                order.getWheelSize(),
                order.getOptions(),
                false);
    }

    @Override
    protected SpecialCar replaceInappropriateOptions(SpecialCar moreSuitableCar,  Order clientOrder) {
        if (moreSuitableCar == null || clientOrder == null) return null;
        if (!(moreSuitableCar.getCarColor().equals(clientOrder.getCarColor()))) {
            moreSuitableCar.setCarColor(clientOrder.getCarColor());
        }
        if (!(moreSuitableCar.getWheelSize().equals(clientOrder.getWheelSize()))) {
            moreSuitableCar.setWheelSize(clientOrder.getWheelSize());
        }
        if (moreSuitableCar.getOptions().size() == 0
                || moreSuitableCar.getOptions().equals(clientOrder.getOptions())) {
            moreSuitableCar.setOptions(clientOrder.getOptions());
        }
        return moreSuitableCar;
    }

    @Override
    protected void fillStock() {
        carsInStock = new ArrayList<>();
        carsInStock.add(new SpecialCar(CarType.FIRE_CAR, CarBrand.FORD, CarEngine.GAS_ENGINE,
                2011, CarColor.RED, CarWheelSize.MIDDLE,false));
    }

    @Override
    public List<SpecialCar> getCarsInStock() {
        return carsInStock;
    }
}
