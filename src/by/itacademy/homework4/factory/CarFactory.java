package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.CarBrand;
import by.itacademy.homework4.car.enums.CarColor;
import by.itacademy.homework4.car.enums.CarEngine;
import by.itacademy.homework4.car.enums.CarWheelSize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class CarFactory {
    protected List<CarBrand> carBrandList;
    protected List<CarEngine> carEngineList;
    protected List<CarColor> carColorList;
    protected List<CarWheelSize> carWheelSizeList;

    public CarFactory() {
        this.carBrandList = new ArrayList<>(Arrays.asList(CarBrand.values()));
        this.carEngineList = new ArrayList<>(Arrays.asList(CarEngine.values()));
        this.carColorList = new ArrayList<>(Arrays.asList(CarColor.values()));
        this.carWheelSizeList = new ArrayList<>(Arrays.asList(CarWheelSize.values()));
    }
    public abstract Car createCar();
    public abstract Car replaceInappropriateOptions();
    public abstract List<Car> getCarsInStock();

    public void showCarBrands() {
        carBrandList.forEach(System.out::println);
    }

    public void showCarEngines() {
        carEngineList.forEach(System.out::println);
    }

    public void showCarColors() {
        carColorList.forEach(System.out::println);
    }

    public void showCarWheelSizes() {
        carWheelSizeList.forEach(System.out::println);
    }

    public List<CarBrand> getCarBrandList() {
        return carBrandList;
    }

    public List<CarEngine> getCarEngineList() {
        return carEngineList;
    }

    public List<CarColor> getCarColorList() {
        return carColorList;
    }

    public List<CarWheelSize> getCarWheelSizeList() {
        return carWheelSizeList;
    }
}
