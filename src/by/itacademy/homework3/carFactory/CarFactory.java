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

    public CarFactory() {
        carBrands = new ArrayList<>(Arrays.asList(CarBrand.values()));
        carEngines = new ArrayList<>(Arrays.asList(CarEngine.values()));
        carColors = new ArrayList<>(Arrays.asList(CarColor.values()));
        carWheelSizes = new ArrayList<>(Arrays.asList(CarWheelSize.values()));
        factoryStock = new FactoryStock();
    }

    public <T> void showWorkShopCatalogue(List<T> catalogue) {
        for (T t : catalogue) {
            System.out.println(t);
        }
    }

    public Car createCar(Order clientOrder) {
        if (checkCarInTheStock(clientOrder) != null) {
            return new Car(clientOrder.getCarBrand(), clientOrder.getCarEngine(), clientOrder.getIssueYear(),
                    clientOrder.getCarColor(), clientOrder.getWheelSize(), clientOrder.getOptions());
        } else {
            return replaceInappropriateOptions(
                   factoryStock.chooseMoreSuitableCar(clientOrder), clientOrder);
        }
    }

    private Car checkCarInTheStock(Order clientCar) {
        for (Car car : factoryStock.getCars()) {
            if (clientCar.equals(car)) {
                return car;
            }
        }
        return null;
    }

    private Car replaceInappropriateOptions(Car moreSuitableCar,  Order clientOrder) {
        if (moreSuitableCar == null) {
            return null;
        }
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
