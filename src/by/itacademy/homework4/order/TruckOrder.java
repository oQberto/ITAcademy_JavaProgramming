package by.itacademy.homework4.order;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.Truck;
import by.itacademy.homework4.car.markerinterfaces.*;

import static by.itacademy.homework4.validation.Validator.*;

import java.util.List;
import java.util.Objects;

public class TruckOrder extends Order {
    private int loadCapacity;

    public TruckOrder(int issueYear,
                      Brand brand,
                      Engine engine,
                      Color color,
                      WheelSize wheelSize,
                      List<Option> options,
                      int loadCapacity) {
        super(issueYear, brand, engine, color, wheelSize, options);
        isCorrectLoadCapacity(loadCapacity);
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

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        isCorrectLoadCapacity(loadCapacity);
        this.loadCapacity = loadCapacity;
    }
}