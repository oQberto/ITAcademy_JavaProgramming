package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.*;

import java.util.List;

public abstract class CarFactory {
    protected List<Brand> carBrandList;
    protected List<Engine> carEngineList;
    protected List<Color> carColorList;
    protected List<WheelSize> carWheelSizeList;

    public abstract Car createCar(int issueYear,
                                  Brand carBrand,
                                  Engine carEngine,
                                  Color carColor,
                                  WheelSize carWheelSize,
                                  List<Options> options);
    public abstract Car replaceInappropriateOptions(Car car, int issueYear,
                                                            Brand carBrand,
                                                            Engine carEngine,
                                                            Color carColor,
                                                            WheelSize carWheelSize,
                                                            List<Options> options);
    public abstract List<? extends Car> getCarsInStock();
    public abstract void fillStock();

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
}
