package by.itacademy.additionalTasks.inheritance.airline.aircraft.helicopter;

public enum HelicopterBrand {
    AIRBUS("Airbus helicopter"),
    BELL("Bell helicopter");
    private final String helicopterBrandName;

    HelicopterBrand(String helicopterBrandName) {
        this.helicopterBrandName = helicopterBrandName;
    }

    public String getHelicopterBrandName() {
        return helicopterBrandName;
    }
}
