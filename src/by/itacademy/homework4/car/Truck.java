package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.truckenums.*;
import by.itacademy.homework4.car.markerinterfaces.*;

import static by.itacademy.homework4.messages.Message.NullMessages.*;
import static java.util.Objects.*;

import java.util.List;

public class Truck extends Car {
    private LoadCapacity loadCapacity;

    public Truck(int issueYear,
                 Brand carBrand,
                 Engine carEngine,
                 Color carColor,
                 WheelSize wheelSize,
                 List<Option> options,
                 LoadCapacity loadCapacity) {
        super(issueYear, carBrand, carEngine, carColor, wheelSize, options);
        requireNonNull(loadCapacity, NULL_LOAD_CAPACITY);
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
    public LoadCapacity getUniqueParam() {
        return loadCapacity;
    }

    @Override
    public void setUniqueParam(UniqueParam uniqueParam) {
        requireNonNull(uniqueParam, NULL_LOAD_CAPACITY);
        this.loadCapacity = (LoadCapacity) uniqueParam;
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
