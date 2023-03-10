package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.car.enums.truckenum.LoadCapacity;

import java.util.List;

public class Truck extends Car {
    private LoadCapacity loadCapacity;

    public Truck(int issueYear,
                 CarBrand carBrand,
                 CarEngine carEngine,
                 CarColor carColor,
                 CarWheelSize carWheelSize,
                 List<Options> options,
                 LoadCapacity loadCapacity) {
        super(issueYear, carBrand, carEngine, carColor, carWheelSize, options);
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

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
