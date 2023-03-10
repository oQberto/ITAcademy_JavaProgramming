package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.*;

import java.util.List;

public class Truck extends Car {
    public Truck(int issueYear,
                 CarBrand carBrand,
                 CarEngine carEngine,
                 CarColor carColor,
                 CarWheelSize carWheelSize,
                 List<Options> options) {
        super(issueYear, carBrand, carEngine, carColor, carWheelSize, options);
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
                '}';
    }
}
