package by.itacademy.homework4.validation;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.markerinterfaces.*;
import by.itacademy.homework4.validation.exception.OptionRemoveException;
import by.itacademy.homework4.validation.exception.SetArgumentException;

import static by.itacademy.homework4.messages.Message.NotExistMessage.*;
import static by.itacademy.homework4.messages.Message.ErrorMessage.*;


public class Validator {
    private Validator() {
    }

    public static void isCorrectLoadCapacity(int loadCapacity) {
        if (loadCapacity < 0 || loadCapacity > 100) {
            throw new IllegalArgumentException(INVALID_LOAD_CAPACITY);
        }
    }

    public static boolean isExistOption(Car car, Option option) throws OptionRemoveException {
        for (Option carOption : car.getOptions()) {
            if (carOption == option) {
                return true;
            }
        }
        throw new OptionRemoveException(OPTION_NOT_EXIST);
    }

    public static void isSetWheelSize(Car car, WheelSize wheelSize) throws SetArgumentException {
        if (car.getWheelSize() == wheelSize) {
            throw new SetArgumentException(WHEEL_SIZE_ALREADY_SET);
        }
    }

    public static void isSetColor(Car car, Color color) throws SetArgumentException {
        if (car.getCarColor() == color) {
            throw new SetArgumentException(COLOR_ALREADY_SET);
        }
    }

    public static void isSetOption(Car car, Option option) throws SetArgumentException {
        for (Option option1 : car.getOptions()) {
            if (option1 == option) {
                throw new SetArgumentException(OPTION_ALREADY_SET);
            }
        }
    }

    public static boolean isExistingColor(Car car, Color changeableColor) {
        for (Color color : car.getColors()) {
            if (changeableColor == color) return true;
        }
        throw new IllegalArgumentException(COLOR_NOT_EXIST);
    }

    public static boolean isExistingWheelSize(Car car, WheelSize changeableWheelSize) {
        for (WheelSize wheelSize : car.getWheelSizes()) {
            if (changeableWheelSize == wheelSize) return true;
        }
        throw new IllegalArgumentException(WHEEL_SIZE_NOT_EXIST);
    }
}
