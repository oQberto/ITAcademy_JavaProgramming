package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.truckenums.*;
import by.itacademy.homework4.car.markerinterfaces.*;

import static by.itacademy.homework4.validation.Validator.*;

import java.util.List;

public class Truck extends Car {
    private int loadCapacity;

    public Truck(int issueYear,
                 Brand carBrand,
                 Engine carEngine,
                 Color carColor,
                 WheelSize wheelSize,
                 List<Option> options,
                 int loadCapacity) {
        super(issueYear, carBrand, carEngine, carColor, wheelSize, options);
        isCorrectLoadCapacity(loadCapacity);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "loadCapacity=" + loadCapacity +
                '.';
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        isCorrectLoadCapacity(loadCapacity);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public Color[] getColors() {
        return TruckColor.values();
    }

    @Override
    public WheelSize[] getWheelSizes() {
        return TruckWheelSize.values();
    }

}
