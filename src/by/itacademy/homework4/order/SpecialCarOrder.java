package by.itacademy.homework4.order;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.SpecialCar;
import by.itacademy.homework4.car.enums.specialcarenums.SpecialCarType;
import by.itacademy.homework4.car.markerinterfaces.*;

import java.util.List;
import java.util.Objects;

public class SpecialCarOrder extends Order {
    private SpecialCarType specialCarType;

    public SpecialCarOrder(int issueYear,
                           Brand brand,
                           Engine engine,
                           Color color,
                           WheelSize wheelSize,
                           List<Option> options,
                           SpecialCarType specialCarType) {
        super(issueYear, brand, engine, color, wheelSize, options);
        this.specialCarType = specialCarType;
    }

    @Override
    public UniqueParam getUniqueParam() {
        return specialCarType;
    }

    @Override
    public void setUniqueParam(UniqueParam specialCarType) {
        this.specialCarType = (SpecialCarType) specialCarType;
    }

    @Override
    public boolean compare(Car specialCar) {
        if (!super.compare(specialCar)) return false;
        return this.specialCarType == ((SpecialCar) specialCar).getSpecialCarType();
    }

    @Override
    public int hashCode() {
        return Objects
                .hash(super.hashCode(), specialCarType);
    }

    public SpecialCarType getSpecialCarType() {
        return specialCarType;
    }

    public void setSpecialCarType(SpecialCarType specialCarType) {
        this.specialCarType = specialCarType;
    }
}
