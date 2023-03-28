package by.itacademy.homework4.start;

import by.itacademy.homework4.order.Order;
import by.itacademy.homework4.order.TruckOrder;
import by.itacademy.homework4.showroom.Showroom;
import by.itacademy.homework4.factory.TruckFactory;
import by.itacademy.homework4.order.SpecialCarOrder;
import by.itacademy.homework4.utils.AppUI.AppUIUtils;
import by.itacademy.homework4.order.PassengerCarOrder;
import by.itacademy.homework4.utils.writer.OrderHistory;
import by.itacademy.homework4.car.markerinterfaces.Brand;
import by.itacademy.homework4.car.markerinterfaces.Color;
import by.itacademy.homework4.car.markerinterfaces.Engine;
import by.itacademy.homework4.car.enums.specialcarenums.*;
import by.itacademy.homework4.car.enums.passengercarenums.*;
import by.itacademy.homework4.car.markerinterfaces.WheelSize;
import by.itacademy.homework4.car.enums.truckenums.TruckColor;
import by.itacademy.homework4.car.enums.truckenums.TruckBrand;
import by.itacademy.homework4.car.enums.truckenums.TruckEngine;
import by.itacademy.homework4.car.enums.truckenums.TruckWheelSize;

import static by.itacademy.homework4.utils.AppUI.AppUIUtils.*;
import static by.itacademy.homework4.messages.Message.ErrorMessage.*;
import static by.itacademy.homework4.messages.Message.SystemMessage.*;
import static by.itacademy.homework4.messages.Message.ConsoleCommands.*;
import static by.itacademy.homework4.messages.Message.ConsoleCommandsDescription.*;

public class AppUI {
    private final Showroom showroom = new Showroom();
    private final TruckFactory truckFactory = new TruckFactory();
    private Order order = null;
    private String userInput;

    public void start() {
        introduce();
        userInput = userInput();
        while (!userInput.equals(EXIT_FROM_APP)) {
            manage(userInput);

            System.out.println(truckFactory.createCar((TruckOrder) order));
            userInput = userInput();
        }
    }

    private void manage(String userInput) {
        switch (userInput) {
            case HELP -> showCommands();
            case ORDER -> createOrder();
            default -> System.err.println(COMMAND_NOT_SUPPORT);
        }
    }

    private void orderCar() {

    }

    private void createOrder() {
        System.out.println("here");
        userInput = AppUIUtils.userInput();
        switch (userInput) {
            case TRUCK -> createTruckOrder();
            case SPECIAL_CAR -> createSpecialCarOrder();
            case PASSENGER_CAR -> createPassengerCarOrder();
            default -> System.out.println(COMMAND_NOT_SUPPORT);
        }
    }

    private void createPassengerCarOrder() {
        order = new PassengerCarOrder(
                2023,
                (Brand) chooseConfig(PassengerCarBrand.values()),
                (Engine) chooseConfig(PassengerCarEngine.values()),
                (Color) chooseConfig(PassengerCarColor.values()),
                (WheelSize) chooseConfig(PassengerCarWheelSize.values()),
                null,
                (PassengerCarFuelType) chooseConfig(PassengerCarFuelType.values()));
    }

    private void createSpecialCarOrder() {
        order = new SpecialCarOrder(
                2023,
                (Brand) chooseConfig(SpecialCarBrand.values()),
                (Engine) chooseConfig(SpecialCarEngine.values()),
                (Color) chooseConfig(SpecialCarColor.values()),
                (WheelSize) chooseConfig(SpecialCarWheelSize.values()),
                null,
                (SpecialCarType) chooseConfig(SpecialCarType.values()));
    }

    private void createTruckOrder() {
        order = new TruckOrder(
                2023,
                (Brand) chooseConfig(TruckBrand.values()),
                (Engine) chooseConfig(TruckEngine.values()),
                (Color) chooseConfig(TruckColor.values()),
                (WheelSize) chooseConfig(TruckWheelSize.values()),
                null,
                chooseLoadCapacity());
    }

    private void findOrderedCarsByBrand(Brand brand) {
        OrderHistory.findCarsInHistoryByBrand(brand);
    }


    private void introduce() {
        System.out.println(INTRODUCTION);
        showCommands();
    }

    private void showCommands() {
        System.out.println(HELP + HELP_DESCRIPTION);
        System.out.println(SHOW_CATALOGUE + SHOW_CATALOGUE_DESCRIPTION);
        System.out.println(SHOW_HISTORY + SHOW_HISTORY_DESCRIPTION);
        System.out.println(ORDER + ORDER_DESCRIPTION);
        System.out.println(EXIT_FROM_APP + EXIT_FROM_APP_DESCRIPTION + "\n");
        System.out.println(FIND_CAR_BY_BRAND + FIND_CAR_BY_BRAND_DESCRIPTION);
        System.out.println(FIND_CAR_BY_YEAR + FIND_CAR_BY_YEAR_DESCRIPTION);
        System.out.println(FIND_CAR_BY_DATE + FIND_CAR_BY_DATE_DESCRIPTION + "\n");
        System.out.println(TRUCK + TRUCK_DESCRIPTION);
        System.out.println(SPECIAL_CAR + SPECIAL_CAR_DESCRIPTION);
        System.out.println(PASSENGER_CAR + PASSENGER_CAR_DESCRIPTION);
    }
}
