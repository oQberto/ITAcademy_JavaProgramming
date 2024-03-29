package by.itacademy.homework4.messages;

public interface Message {
    interface NullMessages {
        String NULL_CAR = "Car must not be null!";
        String NULL_ORDER = "Order must not be null!";
        String NULL_BRAND = "Brand must not be null!";
        String NULL_COLOR = "Color must not be null!";
        String NULL_ENGINE = "Engine must not be null!";
        String NULL_OPTION = "Option must not be null!";
        String NULL_FUEL_TYPE = "Fuel type must not be bull!";
        String NULL_WHEEL_SIZE = "Wheel size must not be null!";
        String NULL_LOAD_CAPACITY = "Load capacity must not be null!";
        String NULL_SPECIAL_CAR_TYPE = "Car type must not be null!";
    }

    interface ErrorMessage {
        String INVALID_DATE = "Invalid date!";
        String OPTION_NOT_EXIST = "Removable option not exist!";
        String COLOR_ALREADY_SET = "You try to set the existing color!";
        String OPTION_ALREADY_SET = "You try to set the existing option!";
        String COMMAND_NOT_SUPPORT = "Command not support!";
        String INVALID_LOAD_CAPACITY = "Invalid load capacity!";
        String WHEEL_SIZE_ALREADY_SET = "You try to set the existing wheel size!";
    }

    interface NotExistMessage {
        String COLOR_NOT_EXIST = "Color doesn't exist for this car!";
        String WHEEL_SIZE_NOT_EXIST = "Wheel size doesn't exist for this car!";
    }

    interface SystemMessage {
        String DATE_FORMAT = "Date format for searching: yyyy-mm-dd.";
        String INTRODUCTION = "Hi, welcome to the showroom!";
        String CHOOSE_CAR = """
                Choose car:
                /tr - truck;
                /sp - special car;
                /pc - passenger car.
                """;
        String TRUCK_ORDER = """
                Choose the truck configuration:
                 brands: %s,
                 engines: %s,
                 colors: %s,
                 wheel sizes: %s
                 load capacity: 0-100
                 """;
        String SPECIAL_CAR_ORDER = """
                Choose the special car configuration:
                 brands: %s,
                 engines: %s,
                 colors: %s,
                 wheel sizes %s,
                 car types: %s
                 """;
        String PASSENGER_CAR_ORDER = """
                Choose the passenger car configuration:
                 brands: %s,
                 engines: %s,
                 colors: %s,
                 wheel sizes: %s,
                 fuel types: %s
                 """;
    }

    interface ConsoleCommands {
        String HELP = "/help";
        String TRUCK = "/tr";
        String ORDER = "/order";
        String SPECIAL_CAR = "/sp";
        String SHOW_HISTORY = "/history";
        String EXIT_FROM_APP = "/exit";
        String PASSENGER_CAR = "/pc";
        String SHOW_CATALOGUE = "/catalogue";
        String FIND_CAR_BY_DATE = "/f_date";
        String FIND_CAR_BY_BRAND = "/f_brand";
    }

    interface ConsoleCommandsDescription {
        String HELP_DESCRIPTION = " - shows app commands;";
        String TRUCK_DESCRIPTION = " - truck;";
        String ORDER_DESCRIPTION = " - order car;";
        String SPECIAL_CAR_DESCRIPTION = " - special car;";
        String SHOW_HISTORY_DESCRIPTION = " - shows order history;";
        String EXIT_FROM_APP_DESCRIPTION = " - finishes work.";
        String PASSENGER_CAR_DESCRIPTION = " - passenger car.";
        String SHOW_CATALOGUE_DESCRIPTION = " - show showroom catalogue;";
        String FIND_CAR_BY_DATE_DESCRIPTION = " - find car by order date.";
        String FIND_CAR_BY_BRAND_DESCRIPTION = " - find car by brand;";
    }
}
