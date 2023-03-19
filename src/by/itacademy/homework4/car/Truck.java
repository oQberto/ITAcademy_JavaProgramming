package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.car.enums.truckenums.*;

import java.util.List;

public class Truck extends Car {
    private LoadCapacity loadCapacity;

    public Truck(int issueYear,
                 Brand carBrand,
                 Engine carEngine,
                 Color carColor,
                 WheelSize wheelSize,
                 List<Options> options,
                 LoadCapacity loadCapacity) {
        super(issueYear, carBrand, carEngine, carColor, wheelSize, options);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "issueYear=" + issueYear +
                ", carBrand=" + carBrand +
                ", carEngine=" + carEngine +
                ", carColor=" + carColor +
                ", wheelSize=" + wheelSize +
                ", options=" + options +
                ", loadCapacity=" + loadCapacity +
                '}';
    }

    @Override
    public Color[] getColors() {
        return TruckColor.values();
    }

    @Override
    public WheelSize[] getWheelSizes() {
        return TruckWheelSize.values();
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
