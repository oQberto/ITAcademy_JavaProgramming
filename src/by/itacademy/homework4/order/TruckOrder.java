package by.itacademy.homework4.order;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TruckOrder that = (TruckOrder) o;
        return loadCapacity == that.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
