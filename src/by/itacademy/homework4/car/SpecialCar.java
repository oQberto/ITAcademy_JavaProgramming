package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.specialcarenums.*;
import by.itacademy.homework4.car.markerinterfaces.*;
import by.itacademy.homework4.order.Order;
import by.itacademy.homework4.order.SpecialCarOrder;

import java.util.List;

import static by.itacademy.homework4.messages.Message.NullMessages.*;
import static java.util.Objects.*;

public class SpecialCar extends Car {
    private SpecialCarType specialCarType;

    public SpecialCar(int issueYear,
                      Brand carBrand,
                      Engine carEngine,
                      Color carColor,
                      WheelSize wheelSize,
                      List<Option> options,
                      SpecialCarType specialCarType) {
        super(issueYear, carBrand, carEngine, carColor, wheelSize, options);
        requireNonNull(specialCarType, NULL_SPECIAL_CAR_TYPE);
        this.specialCarType = specialCarType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "specialCarType=" + specialCarType +
                '.';
    }

    @Override
    public boolean compareWithOrder(Order order) {
        if (super.compareWithOrder(order) &&
                specialCarType == ((SpecialCarOrder) order).getSpecialCarType()) {
            return true;
        }
        return super.compareWithOrder(order);
    }

    public SpecialCarType getSpecialCarType() {
        return specialCarType;
    }

    public void setSpecialCarType(SpecialCarType specialCarType) {
        requireNonNull(specialCarType, NULL_LOAD_CAPACITY);
        this.specialCarType = specialCarType;
    }

    @Override
    public Color[] getColors() {
        return SpecialCarColor.values();
    }

    @Override
    public WheelSize[] getWheelSizes() {
        return SpecialCarWheelSize.values();
    }

}
