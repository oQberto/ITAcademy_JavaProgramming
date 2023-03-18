package by.itacademy.homework4.order;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.Truck;
import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.car.enums.truckenums.LoadCapacity;

import java.util.List;
import java.util.Objects;

public class TruckOrder extends Order {
    private LoadCapacity loadCapacity;

    public TruckOrder(int issueYear,
                      Brand brand,
                      Engine engine,
                      Color color,
                      WheelSize wheelSize,
                      List<Options> options,
                      LoadCapacity loadCapacity) {
        super(issueYear, brand, engine, color, wheelSize, options);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean compare(Car truck) {
        if (!super.compare(truck)) return false;
        return this.loadCapacity == ((Truck) truck).getLoadCapacity();
    }

    @Override
    public int hashCode() {
        return Objects
                .hash(super.hashCode(), loadCapacity);
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}