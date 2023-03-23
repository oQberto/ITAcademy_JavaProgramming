package by.itacademy.homework4.validation;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.markerinterfaces.*;

import java.util.Objects;

import static by.itacademy.homework4.validation.Message.NotExistMessage.*;
import static java.util.Objects.*;

public class Validator {
    private Validator() {
    }

    public static boolean isExistingColor(Car car, Color changeableColor) {
        for (Color color : car.getColors()) {
            if (Objects.equals(changeableColor, color)) return true;
        }
        throw new IllegalArgumentException(COLOR_NOT_EXIST);
    }

    public static boolean isExistingWheelSize(Car car, WheelSize changeableWheelSize) {
        for (WheelSize wheelSize : car.getWheelSizes()) {
            if (Objects.equals(changeableWheelSize, wheelSize)) return true;
        }
        throw new IllegalArgumentException(WHEEL_SIZE_NOT_EXIST);
    }
}
