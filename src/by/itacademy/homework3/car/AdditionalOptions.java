package by.itacademy.homework3.car;

public enum AdditionalOptions {
    CRUISE_CONTROL("Cruise control"),
    DOOR_CLOSER("Door closer"),
    SETTINGS_MEMORY("Memory settings for seats and mirrors"),
    TINTED_GLASS("Tinted glass"),
    HEATED_WINDSHIELD("Heated windshield");
    private final String optionName;

    AdditionalOptions(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionName() {
        return optionName;
    }
}
