package by.itacademy.homework4.start;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.factory.PassengerCarFactory;
import by.itacademy.homework4.factory.SpecialCarFactory;
import by.itacademy.homework4.order.TruckOrder;
import by.itacademy.homework4.showroom.Showroom;
import by.itacademy.homework4.factory.TruckFactory;
import by.itacademy.homework4.order.SpecialCarOrder;
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

import java.util.Arrays;

import static by.itacademy.homework4.utils.AppUI.AppUIUtils.*;
import static by.itacademy.homework4.utils.writer.OrderHistory.*;
import static by.itacademy.homework4.messages.Message.ErrorMessage.*;
import static by.itacademy.homework4.messages.Message.SystemMessage.*;
import static by.itacademy.homework4.messages.Message.ConsoleCommands.*;
import static by.itacademy.homework4.messages.Message.ConsoleCommandsDescription.*;

public class AppUI {
    private final Showroom showroom = new Showroom();
    private final TruckFactory truckFactory = new TruckFactory();
    private final SpecialCarFactory specialCarFactory = new SpecialCarFactory();
    private final PassengerCarFactory passengerCarFactory = new PassengerCarFactory();
    private String userInput;

    public void start() {
        introduce();
        userInput = userInput();
        while (!userInput.equals(EXIT_FROM_APP)) {
            manage(userInput);
            userInput = userInput();
        }
    }

    private void manage(String userInput) {
        switch (userInput) {
            case HELP -> showCommands();
            case ORDER -> orderCar();
            default -> System.err.println(COMMAND_NOT_SUPPORT);
        }
    }

    private void orderCar() {
        System.out.println("Which car do you want?");
        Car clientCar;
        userInput = userInput();
        switch (userInput) {
            case TRUCK -> {
                clientCar = truckFactory.createCar(createTruckOrder());
                writeOrderToFile(clientCar);
                System.out.println(clientCar);
            }
            case SPECIAL_CAR -> {
                clientCar = specialCarFactory.createCar(createSpecialCarOrder());
                writeOrderToFile(clientCar);
                System.out.println(clientCar);
            }
            case PASSENGER_CAR -> {
                clientCar = passengerCarFactory.createCar(createPassengerCarOrder());
                writeOrderToFile(clientCar);
                System.out.println(clientCar);
            }
            default -> System.err.println(COMMAND_NOT_SUPPORT);
        }
    }

    private PassengerCarOrder createPassengerCarOrder() {
        var brands = PassengerCarBrand.values();
        var engines = PassengerCarEngine.values();
        var colors = PassengerCarColor.values();
        var wheelSizes = PassengerCarWheelSize.values();
        var fuelTypes = PassengerCarFuelType.values();
        printfMessage(
                PASSENGER_CAR_ORDER,
                Arrays.toString(brands),
                Arrays.toString(engines),
                Arrays.toString(colors),
                Arrays.toString(wheelSizes),
                Arrays.toString(fuelTypes)
        );
        return new PassengerCarOrder(
                2023,
                (Brand) chooseConfig(brands),
                (Engine) chooseConfig(engines),
                (Color) chooseConfig(colors),
                (WheelSize) chooseConfig(fuelTypes),
                null,
                (PassengerCarFuelType) chooseConfig(fuelTypes)
        );
    }

    private SpecialCarOrder createSpecialCarOrder() {
        var brands = SpecialCarBrand.values();
        var engines = SpecialCarEngine.values();
        var colors = SpecialCarColor.values();
        var wheelSizes = SpecialCarWheelSize.values();
        var carTypes = SpecialCarType.values();
        printfMessage(
                SPECIAL_CAR_ORDER,
                Arrays.toString(brands),
                Arrays.toString(engines),
                Arrays.toString(colors),
                Arrays.toString(wheelSizes),
                Arrays.toString(carTypes)
        );
        return new SpecialCarOrder(
                2023,
                (Brand) chooseConfig(brands),
                (Engine) chooseConfig(engines),
                (Color) chooseConfig(colors),
                (WheelSize) chooseConfig(wheelSizes),
                null,
                (SpecialCarType) chooseConfig(carTypes)
        );
    }

    private TruckOrder createTruckOrder() {
        var brands = TruckBrand.values();
        var engines = TruckEngine.values();
        var colors = TruckColor.values();
        var wheelSizes = TruckWheelSize.values();
        printfMessage(
                TRUCK_ORDER,
                Arrays.toString(brands),
                Arrays.toString(engines),
                Arrays.toString(colors),
                Arrays.toString(wheelSizes)
        );
        return new TruckOrder(
                2023,
                (Brand) chooseConfig(brands),
                (Engine) chooseConfig(engines),
                (Color) chooseConfig(colors),
                (WheelSize) chooseConfig(wheelSizes),
                null,
                chooseLoadCapacity()
        );
    }

    private void findOrderedCarsByBrand(Brand brand) {
        OrderHistory.findCarsInHistoryByBrand(brand);
    }


    private void introduce() {
        System.out.println(INTRODUCTION);
        showCommands();
    }

    private void printfMessage(String message, Object... ob) {
        System.out.printf(message, ob);
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
