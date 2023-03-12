package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.car.enums.truckenum.*;

import java.util.List;

public class Truck extends Car {
    private final TruckCarBrand carBrand;
    private final TruckCarEngine carEngine;
    private TruckCarColor carColor;
    private TruckCarWheelSize wheelSize;
    private List<IOptions> options;
    private LoadCapacity loadCapacity;

    public Truck(int issueYear,
                 Brand carBrand,
                 Engine carEngine,
                 Color carColor,
                 WheelSize wheelSize,
                 List<IOptions> options,
                 LoadCapacity loadCapacity) {
        super(issueYear);
        this.carBrand = (TruckCarBrand) carBrand;
        this.carEngine = (TruckCarEngine) carEngine;
        this.carColor = (TruckCarColor) carColor;
        this.wheelSize = (TruckCarWheelSize) wheelSize;
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
    public List<IOptions> getOptions() {
        return options;
    }

    @Override
    public Color[] getColors() {
        return TruckCarColor.values();
    }

    @Override
    public WheelSize[] getWheelSizes() {
        return TruckCarWheelSize.values();
    }

    @Override
    public void setCarColor(Color color) {
        this.carColor = (TruckCarColor) color;
    }

    @Override
    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = (TruckCarWheelSize) wheelSize;
    }

    @Override
    public void setOptions(List<IOptions> options) {
        this.options = options;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
