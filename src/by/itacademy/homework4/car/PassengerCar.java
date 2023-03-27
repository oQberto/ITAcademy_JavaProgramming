package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.passengercarenums.PassengerCarColor;
import by.itacademy.homework4.car.enums.passengercarenums.PassengerCarFuelType;
import by.itacademy.homework4.car.enums.passengercarenums.PassengerCarWheelSize;
import by.itacademy.homework4.car.markerinterfaces.*;
import by.itacademy.homework4.order.Order;
import by.itacademy.homework4.order.PassengerCarOrder;

import static by.itacademy.homework4.messages.Message.NullMessages.*;

import java.util.List;

import static java.util.Objects.*;

public class PassengerCar extends Car {
    private PassengerCarFuelType passengerCarFuelType;

    public PassengerCar(int issueYear,
                        Brand carBrand,
                        Engine carEngine,
                        Color carColor,
                        WheelSize wheelSize,
                        List<Option> options,
                        UniqueParam passengerCarFuelType) {
        super(issueYear, carBrand, carEngine, carColor, wheelSize, options);
        requireNonNull(passengerCarFuelType, NULL_FUEL_TYPE);
        this.passengerCarFuelType = (PassengerCarFuelType) passengerCarFuelType;
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
    public boolean compareWithOrder(Order order) {
        if (super.compareWithOrder(order) &&
                passengerCarFuelType == ((PassengerCarOrder) order).getPassengerCarFuelType()) {
            return true;
        }
        return super.compareWithOrder(order);
    }

    public PassengerCarFuelType getPassengerCarFuelType() {
        return passengerCarFuelType;
    }

    public void setPassengerCarFuelType(PassengerCarFuelType passengerCarFuelType) {
        requireNonNull(passengerCarFuelType, NULL_LOAD_CAPACITY);
        this.passengerCarFuelType = passengerCarFuelType;
    }

    @Override
    public Color[] getColors() {
        return PassengerCarColor.values();
    }

    @Override
    public WheelSize[] getWheelSizes() {
        return PassengerCarWheelSize.values();
    }

}
