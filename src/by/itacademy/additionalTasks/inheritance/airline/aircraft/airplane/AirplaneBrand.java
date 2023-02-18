package by.itacademy.additionalTasks.inheritance.airline.aircraft.airplane;

public enum AirplaneBrand {
    AIRBUS("Airbus"),
    BOEING("Boeing");
    private final String airplaneBrandName;

    AirplaneBrand(String airplaneBrandName) {
        this.airplaneBrandName = airplaneBrandName;
    }

    public String getAirplaneBrandName() {
        return airplaneBrandName;
    }
}
