package by.itacademy.homework4.order;

import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.car.enums.specialcarenums.SpecialCarType;

import java.util.List;
import java.util.Objects;

public class SpecialCarOrder extends Order {
    private SpecialCarType specialCarType;

    public SpecialCarOrder(int issueYear,
                           Brand brand,
                           Engine engine,
                           Color color,
                           WheelSize wheelSize,
                           List<Options> options,
                           SpecialCarType specialCarType) {
        super(issueYear, brand, engine, color, wheelSize, options);
        this.specialCarType = specialCarType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SpecialCarOrder that = (SpecialCarOrder) o;
        return specialCarType == that.specialCarType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specialCarType);
    }

    public SpecialCarType getSpecialCarType() {
        return specialCarType;
    }

    public void setSpecialCarType(SpecialCarType specialCarType) {
        this.specialCarType = specialCarType;
    }
}
