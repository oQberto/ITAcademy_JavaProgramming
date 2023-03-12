package by.itacademy.homework4.order;

import by.itacademy.homework4.car.SpecialCar;
import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.car.enums.specialcarenums.SpecialCarType;

import java.util.List;

public class SpecialCarOrder extends Order<SpecialCar> {
    private SpecialCarType specialCarType;

    public SpecialCarOrder(int issueYear,
                           Brand brand,
                           Engine engine,
                           Color color,
                           WheelSize wheelSize,
                           List<Options> optionsList,
                           SpecialCarType specialCarType) {
        super(issueYear, brand, engine, color, wheelSize, optionsList);
        this.specialCarType = specialCarType;
    }

    @Override
    public boolean equals(SpecialCar specialCar) {
        return this.issueYear == specialCar.getIssueYear() &&
                this.brand == specialCar.getCarBrand() &&
                this.engine == specialCar.getCarEngine() &&
                this.color == specialCar.getCarColor() &&
                this.wheelSize == specialCar.getWheelSize() &&
                this.optionsList.equals(specialCar.getOptions()) &&
                this.specialCarType == specialCar.getSpecialCarType();
    }

    @Override
    public String toString() {
        return "SpecialCarOrder{" +
                "specialCarType=" + specialCarType +
                ", issueYear=" + issueYear +
                ", brand=" + brand +
                ", engine=" + engine +
                ", color=" + color +
                ", wheelSize=" + wheelSize +
                ", optionsList=" + optionsList +
                '}';
    }

    public SpecialCarType getSpecialCarType() {
        return specialCarType;
    }

    public void setSpecialCarType(SpecialCarType specialCarType) {
        this.specialCarType = specialCarType;
    }
}
