package by.itacademy.homework4.showroom;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.markerinterfaces.Option;
import by.itacademy.homework4.car.markerinterfaces.WheelSize;
import by.itacademy.homework4.car.markerinterfaces.Color;

import by.itacademy.homework4.order.Order;
import by.itacademy.homework4.order.SpecialCarOrder;
import by.itacademy.homework4.order.TruckOrder;

import by.itacademy.homework4.factory.SpecialCarFactory;
import by.itacademy.homework4.factory.TruckFactory;

import by.itacademy.homework4.service.ColorService;
import by.itacademy.homework4.service.OptionService;
import by.itacademy.homework4.service.WheelService;

import java.util.List;

public class Showroom {
    private static final ColorService COLOR_SERVICE = new ColorService();
    private static final WheelService WHEEL_SERVICE = new WheelService();
    private static final OptionService OPTION_SERVICE = new OptionService();
    private static final SpecialCarFactory SPECIAL_CAR_FACTORY = new SpecialCarFactory();
    private static final TruckFactory TRUCK_FACTORY = new TruckFactory();

    private Showroom() {
    }

    public static Car createCar(Order order) {
        if (order instanceof SpecialCarOrder) {
            return SPECIAL_CAR_FACTORY.createCar((SpecialCarOrder) order);
        }
        if (order instanceof TruckOrder) {
            return TRUCK_FACTORY.createCar((TruckOrder) order);
        }
        return null;
    }

    public static void showSpecialCarFactoryCatalogue() {
        SPECIAL_CAR_FACTORY.showFactoryCatalogue();
    }

    public static void showTruckFactoryCatalogue() {
        TRUCK_FACTORY.showFactoryCatalogue();
    }

    public static void changeColor(Car car, Color color) {
        COLOR_SERVICE.change(car, color);
    }

    public static void changeWheelSize(Car car, WheelSize wheelSize) {
        WHEEL_SERVICE.change(car, wheelSize);
    }

    public static void changeOptions(Car car, List<Option> options) {
        OPTION_SERVICE.change(car, options);
    }

    public static void removeOption(Car car, Option option) {
        OPTION_SERVICE.removeOption(car, option);
    }

    public static void addOption(Car car, Option option) {
        OPTION_SERVICE.addOption(car, option);
    }
}
