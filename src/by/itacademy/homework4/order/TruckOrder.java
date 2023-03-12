package by.itacademy.homework4.order;

import by.itacademy.homework4.car.Truck;
import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.car.enums.truckenums.LoadCapacity;

import java.util.List;

public class TruckOrder extends Order<Truck> {
    private LoadCapacity loadCapacity;

    public TruckOrder(int issueYear,
                      Brand brand,
                      Engine engine,
                      Color color,
                      WheelSize wheelSize,
                      List<Options> optionsList,
                      LoadCapacity loadCapacity) {
        super(issueYear, brand, engine, color, wheelSize, optionsList);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Truck truck) {
        return this.issueYear == truck.getIssueYear() &&
                this.brand == truck.getCarBrand() &&
                this.engine == truck.getCarEngine() &&
                this.color == truck.getCarColor() &&
                this.wheelSize == truck.getWheelSize() &&
                this.optionsList.equals(truck.getOptions()) &&
                this.loadCapacity == truck.getLoadCapacity();
    }

    @Override
    public String toString() {
        return "TruckOrder{" +
                "loadCapacity=" + loadCapacity +
                ", issueYear=" + issueYear +
                ", brand=" + brand +
                ", engine=" + engine +
                ", color=" + color +
                ", wheelSize=" + wheelSize +
                ", optionsList=" + optionsList +
                '}';
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
