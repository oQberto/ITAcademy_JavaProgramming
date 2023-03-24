package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.passengercarenums.PassengerCarFuelType;
import by.itacademy.homework4.car.markerinterfaces.*;

import static by.itacademy.homework4.validation.Message.NullMessages.*;

import java.util.List;

import static java.util.Objects.*;

public class PassengerCar extends Car {
    private final PassengerCarFuelType passengerCarFuelType;

    public PassengerCar(int issueYear,
                        Brand carBrand,
                        Engine carEngine,
                        Color carColor,
                        WheelSize wheelSize,
                        List<Option> options,
                        PassengerCarFuelType passengerCarFuelType) {
        super(issueYear, carBrand, carEngine, carColor, wheelSize, options);
        requireNonNull(passengerCarFuelType, NULL_FUEL_TYPE);
        this.passengerCarFuelType = passengerCarFuelType;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "passengerCarFuelType=" + passengerCarFuelType +
                ", issueYear=" + issueYear +
                ", carBrand=" + carBrand +
                ", carEngine=" + carEngine +
                ", carColor=" + carColor +
                ", wheelSize=" + wheelSize +
                ", options=" + options +
                '}';
    }

    @Override
    public UniqueParam getUniqueParam() {
        return null;
    }

    @Override
    public Color[] getColors() {
        return new Color[0];
    }

    @Override
    public WheelSize[] getWheelSizes() {
        return new WheelSize[0];
    }
}
