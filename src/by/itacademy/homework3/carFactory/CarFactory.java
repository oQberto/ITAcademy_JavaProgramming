package by.itacademy.homework3.carFactory;

import by.itacademy.homework3.car.*;
import by.itacademy.homework3.carShowroom.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarFactory {
    private final List<CarBrand> carBrands;
    private final List<CarEngine> carEngines;
    private final List<CarColor> carColors;
    private final List<CarWheelSize> carWheelSizes;
    private final FactoryStock factoryStock;

    public CarFactory(FactoryStock factoryStock) {
        carBrands = new ArrayList<>(Arrays.asList(CarBrand.values()));
        carEngines = new ArrayList<>(Arrays.asList(CarEngine.values()));
        carColors = new ArrayList<>(Arrays.asList(CarColor.values()));
        carWheelSizes = new ArrayList<>(Arrays.asList(CarWheelSize.values()));
        this.factoryStock = factoryStock;
    }

    public <T> void showWorkShopCatalogue(List<T> catalogue) {
        for (T t : catalogue) {
            System.out.println(t);
        }
    }

    public Car createCar(Order order) {
        if (order == null) return null;
        if (factoryStock.checkCar(order) != null) {
            return factoryStock.checkCar(order);
        } else {
            return replaceInappropriateOptions(factoryStock.chooseMoreSuitableCar(order), order);
        }
    }

    private Car replaceInappropriateOptions(Car moreSuitableCar,  Order clientOrder) {
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

    public List<CarBrand> getCarBrands() {
        return carBrands;
    }

    public List<CarEngine> getCarEngines() {
        return carEngines;
    }

    public List<CarColor> getCarColors() {
        return carColors;
    }

    public List<CarWheelSize> getCarWheelSizes() {
        return carWheelSizes;
    }

    public FactoryStock getFactoryStock() {
        return factoryStock;
    }
}
