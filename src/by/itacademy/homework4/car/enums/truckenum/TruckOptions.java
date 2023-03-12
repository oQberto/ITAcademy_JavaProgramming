package by.itacademy.homework4.car.enums.truckenum;

import by.itacademy.homework4.car.enums.IOptions;

public enum TruckOptions implements IOptions {
    CRUISE_CONTROL("Cruise control"),
    DOOR_CLOSER("Door closer"),
    SETTINGS_MEMORY("Memory settings for seats and mirrors"),
    TINTED_GLASS("Tinted glass"),
    HEATED_WINDSHIELD("Heated windshield");
    private final String optionName;

    TruckOptions(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionName() {
        return optionName;
    }
}
