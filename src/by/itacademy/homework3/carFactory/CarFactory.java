package by.itacademy.homework3.carFactory;

import by.itacademy.homework3.car.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarFactory {
    private final List<CarBrand> carBrands;
    private final List<CarEngine> carEngines;
    private final List<CarColor> carColors;
    private final List<CarWheelSize> carWheelSizes;
    private final FactoryStock factoryStock;
    {
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

    public Car createCar(Car clientOrder) {
        if (checkCarInTheStock(clientOrder) == null) {
            return clientOrder;
        } else {
            return replaceInappropriateOptions(chooseMoreSuitableCar(clientOrder), clientOrder);
        }
    }

    private Car checkCarInTheStock(Car testedCar) {
        for (Car car : factoryStock.getCars()) {
            if (testedCar.equals(car)) {
                return car;
            }
        }
        return null;
    }

    public Car chooseMoreSuitableCar(Car clientOrder) {
        Car moreSuitableCar = null;
        int count = 0;
        int maxMatches = 0;
        for (Car car : factoryStock.getCars()) {
            if (car.getCarBrand().equals(clientOrder.getCarBrand())
                    && car.getCarEngine().equals(clientOrder.getCarEngine())
                    && car.getIssueYear() == clientOrder.getIssueYear()) {
                count++;

                if (car.getCarColor().equals(clientOrder.getCarColor())) {
                    count++;
                }
                if (car.getWheelSize().equals(clientOrder.getWheelSize())) {
                    count++;
                }
            }
            if (count > maxMatches) {
                moreSuitableCar = car;
                maxMatches = count;
            }
            count = 0;
        }
        return moreSuitableCar;
    }

    private Car replaceInappropriateOptions(Car moreSuitableCar,  Car clientOrder) {
        if (moreSuitableCar == null) {
            return null;
        }
        if (!(moreSuitableCar.getCarColor().equals(clientOrder.getCarColor()))) {
            moreSuitableCar.setCarColor(clientOrder.getCarColor());
        }
        if (!(moreSuitableCar.getWheelSize().equals(clientOrder.getWheelSize()))) {
            moreSuitableCar.setWheelSize(clientOrder.getWheelSize());
        }
        if (!(moreSuitableCar.getOptions() == null
                || moreSuitableCar.getOptions().equals(clientOrder.getOptions()))) {
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
