package by.itacademy.homework4.order;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.PassengerCar;
import by.itacademy.homework4.car.enums.passengercarenums.PassengerCarFuelType;
import by.itacademy.homework4.car.markerinterfaces.*;

import static by.itacademy.homework4.validation.Message.NullMessages.*;

import java.util.List;

import static java.util.Objects.*;

public class PassengerCarOrder extends Order {
    private PassengerCarFuelType passengerCarFuelType;

    public PassengerCarOrder(int issueYear,
                             Brand brand,
                             Engine engine,
                             Color color,
                             WheelSize wheelSize,
                             List<Option> options,
                             PassengerCarFuelType passengerCarFuelType) {
        super(issueYear, brand, engine, color, wheelSize, options);
        requireNonNull(passengerCarFuelType, NULL_FUEL_TYPE);
        this.passengerCarFuelType = passengerCarFuelType;
    }

    @Override
    public boolean compare(Car passengerCar) {
        if (!super.compare(passengerCar)) return false;
        return this.passengerCarFuelType == ((PassengerCar) passengerCar).getPassengerCarFuelType();
    }

    @Override
    public int hashCode() {
        return hash(super.hashCode(), passengerCarFuelType);
    }

    @Override
    public UniqueParam getUniqueParam() {
        return passengerCarFuelType;
    }

    @Override
    public void setUniqueParam(UniqueParam fuelType) {
        requireNonNull(fuelType, NULL_FUEL_TYPE);
        this.passengerCarFuelType = (PassengerCarFuelType) fuelType;
    }
}
