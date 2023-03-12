package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.car.enums.truckenum.*;

import java.util.List;

public class Truck extends Car {
    private final TruckBrand carBrand;
    private final TruckEngine carEngine;
    private TruckColor carColor;
    private TruckWheelSize wheelSize;
    private List<Options> options;
    private LoadCapacity loadCapacity;

    public Truck(int issueYear,
                 Brand carBrand,
                 Engine carEngine,
                 Color carColor,
                 WheelSize wheelSize,
                 List<Options> options,
                 LoadCapacity loadCapacity) {
        super(issueYear);
        this.carBrand = (TruckBrand) carBrand;
        this.carEngine = (TruckEngine) carEngine;
        this.carColor = (TruckColor) carColor;
        this.wheelSize = (TruckWheelSize) wheelSize;
        this.options = options;
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
    public Brand getCarBrand() {
        return carBrand;
    }

    @Override
    public Engine getCarEngine() {
        return carEngine;
    }

    @Override
    public Color getCarColor() {
        return carColor;
    }

    @Override
    public WheelSize getWheelSize() {
        return wheelSize;
    }

    @Override
    public List<Options> getOptions() {
        return options;
    }

    @Override
    public Color[] getColors() {
        return TruckColor.values();
    }

    @Override
    public WheelSize[] getWheelSizes() {
        return TruckWheelSize.values();
    }

    @Override
    public void setCarColor(Color color) {
        this.carColor = (TruckColor) color;
    }

    @Override
    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = (TruckWheelSize) wheelSize;
    }

    @Override
    public void setOptions(List<Options> options) {
        this.options = options;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
