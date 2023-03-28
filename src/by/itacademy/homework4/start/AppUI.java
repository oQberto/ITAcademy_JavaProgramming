package by.itacademy.homework4.start;


import by.itacademy.homework4.car.markerinterfaces.Brand;
import by.itacademy.homework4.utils.writer.OrderHistory;

import static by.itacademy.homework4.messages.Message.ConsoleCommandsDescription.*;
import static by.itacademy.homework4.messages.Message.ConsoleCommands.*;
import static by.itacademy.homework4.messages.Message.SystemMessage.*;
import static by.itacademy.homework4.messages.Message.ErrorMessage.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppUI {

    public void start() {
        introduce();
        String userInput = userInput();
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

    }

    private void findOrderedCarsByBrand(Brand brand) {
        OrderHistory.findCarsInHistoryByBrand(brand);
    }

    private String userInput() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
