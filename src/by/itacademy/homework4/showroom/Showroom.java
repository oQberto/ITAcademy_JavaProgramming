package by.itacademy.homework4.showroom;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.PassengerCar;
import by.itacademy.homework4.car.SpecialCar;
import by.itacademy.homework4.car.Truck;
import by.itacademy.homework4.car.markerinterfaces.Option;
import by.itacademy.homework4.car.markerinterfaces.WheelSize;
import by.itacademy.homework4.car.markerinterfaces.Color;

import by.itacademy.homework4.factory.PassengerCarFactory;
import by.itacademy.homework4.order.PassengerCarOrder;
import by.itacademy.homework4.order.SpecialCarOrder;
import by.itacademy.homework4.order.TruckOrder;

import by.itacademy.homework4.factory.SpecialCarFactory;
import by.itacademy.homework4.factory.TruckFactory;

import by.itacademy.homework4.service.ColorService;
import by.itacademy.homework4.service.OptionService;
import by.itacademy.homework4.service.WheelService;
import by.itacademy.homework4.validation.exception.OptionRemoveException;
import by.itacademy.homework4.validation.exception.SetArgumentException;

import java.util.List;

public class Showroom {
    private final ColorService COLOR_SERVICE = new ColorService();
    private final WheelService WHEEL_SERVICE = new WheelService();
    private final OptionService OPTION_SERVICE = new OptionService();
    private final PassengerCarFactory PASSENGER_CAR_FACTORY = new PassengerCarFactory();
    private final SpecialCarFactory SPECIAL_CAR_FACTORY = new SpecialCarFactory();
    private final TruckFactory TRUCK_FACTORY = new TruckFactory();

    public SpecialCar orderSpecialCar(SpecialCarOrder order) {
        return SPECIAL_CAR_FACTORY.createCar(order);
    }

    public Truck orderTruck(TruckOrder order) {
        return TRUCK_FACTORY.createCar(order);
    }

    public PassengerCar orderPassengerCar(PassengerCarOrder order) {
        return PASSENGER_CAR_FACTORY.createCar(order);
    }

    public void showSpecialCarFactoryCatalogue() {
        SPECIAL_CAR_FACTORY.showFactoryCatalogue();
    }

    public void showTruckFactoryCatalogue() {
        TRUCK_FACTORY.showFactoryCatalogue();
    }

    public void showPassengerCarFactoryCatalogue() {
        PASSENGER_CAR_FACTORY.showFactoryCatalogue();
    }

    public void changeColor(Car car, Color color) throws SetArgumentException {
        COLOR_SERVICE.change(car, color);
    }

    public void changeWheelSize(Car car, WheelSize wheelSize) throws SetArgumentException {
        WHEEL_SERVICE.change(car, wheelSize);
    }

    public void changeOptions(Car car, List<Option> options) {
        OPTION_SERVICE.change(car, options);
    }

    public void removeOption(Car car, Option option) throws OptionRemoveException {
        OPTION_SERVICE.removeOption(car, option);
    }

    public void addOption(Car car, Option option) throws SetArgumentException {
        OPTION_SERVICE.addOption(car, option);
    }
}
