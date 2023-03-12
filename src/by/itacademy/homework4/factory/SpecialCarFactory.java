package by.itacademy.homework4.factory;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.SpecialCar;
import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.car.enums.specialcarenums.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialCarFactory extends CarFactory {
    private List<SpecialCar> carsInStock;
    private final FactoryStock<SpecialCar> specialCarFactoryStock;

    public SpecialCarFactory() {
        super.carBrandList = Arrays.asList(SpecialCarBrand.values());
        super.carEngineList = Arrays.asList(SpecialCarEngine.values());
        super.carColorList = Arrays.asList(SpecialCarColor.values());
        super.carWheelSizeList = Arrays.asList(SpecialCarWheelSize.values());
        fillStock();
        this.specialCarFactoryStock = new FactoryStock<>(carsInStock);
    }

    @Override
    public Car replaceInappropriateOptions(Car specialCar,
                                           int issueYear,
                                           Brand carBrand,
                                           Engine carEngine,
                                           Color carColor,
                                           WheelSize carWheelSize,
                                           List<IOptions> options) {
        if (!(specialCar.getCarColor().equals(carColor))) {
            specialCar.setCarColor(carColor);
        }
        if (!(specialCar.getWheelSize().equals(carWheelSize))) {
            specialCar.setWheelSize(carWheelSize);
        }
        if (specialCar.getOptions() == null
                || specialCar.getOptions().equals(options)) {
            specialCar.setOptions(options);
        }
        return specialCar;
    }

    @Override
    public List<SpecialCar> getCarsInStock() {
        return carsInStock;
    }

    @Override
    public Car createCar(int issueYear,
                         Brand carBrand,
                         Engine carEngine,
                         Color carColor,
                         WheelSize carWheelSize,
                         List<IOptions> options) {
        if (specialCarFactoryStock.checkCar(issueYear, carBrand, carEngine, carColor, carWheelSize, options) != null) {
            return specialCarFactoryStock.getClientCar();
        } else if (replaceInappropriateOptions(
                specialCarFactoryStock.chooseMoreSuitableCar(
                        issueYear, carBrand, carEngine, carColor, carWheelSize, options),
                issueYear, carBrand, carEngine, carColor, carWheelSize, options) != null) {
            return replaceInappropriateOptions(specialCarFactoryStock.getMoreSuitableCar(), issueYear,
                    carBrand, carEngine, carColor, carWheelSize, options);
        }
        return new SpecialCar(issueYear, carBrand, carEngine, carColor, carWheelSize, options, null);
    }

    @Override
    public void fillStock() {
        carsInStock = new ArrayList<>();
        carsInStock.add(new SpecialCar(2023, SpecialCarBrand.FORD, SpecialCarEngine.COMMON_RAIL, SpecialCarColor.BLACK,
                SpecialCarWheelSize.MIDDLE, null, null));
    }
}
