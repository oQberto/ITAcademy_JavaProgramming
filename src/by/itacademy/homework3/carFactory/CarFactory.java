package by.itacademy.homework3.carFactory;

import by.itacademy.homework3.car.*;
import by.itacademy.homework3.car.specialcar.*;
import by.itacademy.homework3.carShowroom.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class CarFactory {
    private final List<CarBrand> carBrands;
    private final List<CarEngine> carEngines;
    private final List<CarColor> carColors;
    private final List<CarWheelSize> carWheelSizes;

    public CarFactory() {
        carBrands = new ArrayList<>(Arrays.asList(CarBrand.values()));
        carEngines = new ArrayList<>(Arrays.asList(CarEngine.values()));
        carColors = new ArrayList<>(Arrays.asList(CarColor.values()));
        carWheelSizes = new ArrayList<>(Arrays.asList(CarWheelSize.values()));
    }

    public <T> void showWorkShopCatalogue(List<T> catalogue) {
        for (T t : catalogue) {
            System.out.println(t);
        }
    }

    public abstract Car createCar(Order order);
    protected abstract Car replaceInappropriateOptions(Car moreSuitableCar,  Order clientOrder);
    protected abstract void fillStock();

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
}
