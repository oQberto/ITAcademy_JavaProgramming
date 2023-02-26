package by.itacademy.homework3.carFactory.specialcarsfactory;

import by.itacademy.homework3.car.*;
import by.itacademy.homework3.car.specialcar.*;
import by.itacademy.homework3.carFactory.*;
import by.itacademy.homework3.carShowroom.Order;

import java.util.ArrayList;
import java.util.List;

public class SpecialCarsFactory extends CarFactory {
    private List<Car> carsInStock;
    private final FactoryStock factoryStock;

    public SpecialCarsFactory() {
        fillStock();
        this.factoryStock = new FactoryStock(carsInStock);
    }

    @Override
    public Car createCar(Order order) {
        if (order == null) return null;
        if (factoryStock.checkCar(order) != null) {
            return factoryStock.checkCar(order);
        } else {
            return replaceInappropriateOptions(
                    factoryStock.chooseMoreSuitableCar(order), order
            );
        }
    }

    @Override
    protected Car replaceInappropriateOptions(Car moreSuitableCar,  Order clientOrder) {
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
        carsInStock.add(new SpecialCar(CarBrand.FORD, CarEngine.GAS_ENGINE,
                2010, CarColor.RED, CarWheelSize.MIDDLE,
                CarType.AMBULANCE, false));
    }

    public List<Car> getCarsInStock() {
        return carsInStock;
    }
}
