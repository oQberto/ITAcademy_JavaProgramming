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
        String COLOR_ALREADY_SET = "You try to set the existing color!";
        String OPTION_ALREADY_SET = "You try to set the existing option!";
        String WHEEL_SIZE_ALREADY_SET = "You try to set the existing wheel size!";
        String OPTION_NOT_EXIST = "Removable option not exist!";
    }

    interface NotExistMessage {
        String COLOR_NOT_EXIST = "Color doesn't exist for this car!";
        String WHEEL_SIZE_NOT_EXIST = "Wheel size doesn't exist for this car!";
    }

    interface SystemMessage {
        String INTRODUCTION = "Hi, welcome to the showroom!";
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
        String FIND_CAR_BY_YEAR = "/f_year";
        String FIND_CAR_BY_DATE = "/f_date: ";
        String FIND_CAR_BY_BRAND = "/f_brand: ";
    }
}
