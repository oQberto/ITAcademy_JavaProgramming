package by.itacademy.homework4.validation;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.*;
import by.itacademy.homework4.order.Order;

import java.util.Objects;

import static by.itacademy.homework4.validation.Message.NullMessages.*;
import static by.itacademy.homework4.validation.Message.NotExistMessage.*;
import static java.util.Objects.*;

public class Validator {
    private Validator() {
    }

    public static void isNullCar(Car car) {
        isNullObject(car, NULL_CAR);
    }

    public static void isNullOrder(Order order) {
        isNullObject(order, NULL_ORDER);
    }

    public static void isNullBrand(Brand brand) {
        isNullObject(brand, NULL_BRAND);
    }

    public static void isNullColor(Color color) {
        isNullObject(color, NULL_COLOR);
    }

    public static void isNullEngine(Engine engine) {
        isNullObject(engine, NULL_ENGINE);
    }

    public static void isNullOption(Option options) {
        isNullObject(options, NULL_OPTION);
    }

    public static void isNullWheelSize(WheelSize wheelSize) {
        isNullObject(wheelSize, NULL_WHEEL_SIZE);
    }

    public static boolean isExistingColor(Car car,Color changeableColor) {
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

    private static void isNullObject(Object object, String message) {
        if (isNull(object)) throw new NullPointerException(message);
    }
}
