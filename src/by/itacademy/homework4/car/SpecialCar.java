package by.itacademy.homework4.car;

import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.car.enums.specialcarenums.*;

import java.util.List;

public class SpecialCar extends Car {
    private final SpecialCarBrand carBrand;
    private final SpecialCarEngine carEngine;
    private SpecialCarColor carColor;
    private SpecialCarWheelSize wheelSize;
    private List<IOptions> options;
    private SpecialCarType specialCarType;

    public SpecialCar(int issueYear,
                      Brand carBrand,
                      Engine carEngine,
                      Color carColor,
                      WheelSize wheelSize,
                      List<IOptions> options,
                      SpecialCarType specialCarType) {
        super(issueYear);
        this.carBrand = (SpecialCarBrand) carBrand;
        this.carEngine = (SpecialCarEngine) carEngine;
        this.carColor = (SpecialCarColor) carColor;
        this.wheelSize = (SpecialCarWheelSize) wheelSize;
        this.options = options;
        this.specialCarType = specialCarType;
    }

    @Override
    public String toString() {
        return "SpecialCar{" +
                "issueYear=" + issueYear +
                ", carBrand=" + carBrand +
                ", carEngine=" + carEngine +
                ", carColor=" + carColor +
                ", wheelSize=" + wheelSize +
                ", options=" + options +
                ", carType=" + specialCarType +
                '}';
    }

    @Override
    public Brand getCarBrand() {
        return carBrand;
    }

    @Override
    public Engine getCarEngine() {
        return carEngine;
    }

    @Override
    public Color getCarColor() {
        return carColor;
    }

    @Override
    public WheelSize getWheelSize() {
        return wheelSize;
    }

    @Override
    public List<IOptions> getOptions() {
        return options;
    }

    @Override
    public Color[] getColors() {
        return SpecialCarColor.values();
    }

    @Override
    public WheelSize[] getWheelSizes() {
        return SpecialCarWheelSize.values();
    }

    @Override
    public void setCarColor(Color color) {
        this.carColor = (SpecialCarColor) color;
    }

    @Override
    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = (SpecialCarWheelSize) wheelSize;
    }

    @Override
    public void setOptions(List<IOptions> options) {
        this.options = options;
    }

    public SpecialCarType getSpecialCarType() {
        return specialCarType;
    }

    public void setSpecialCarType(SpecialCarType specialCarType) {
        this.specialCarType = specialCarType;
    }
}
