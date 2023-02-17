package by.itacademy.additionalTasks.inheritance.airline.aircraft;

public abstract class Aircraft {
    protected int flightRage;
    protected int flightHeight;

    public Aircraft(int flightRage, int flightHeight) {
        this.flightRage = flightRage;
        this.flightHeight = flightHeight;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "flightRage=" + flightRage +
                ", flightHeight=" + flightHeight +
                " }";
    }

    public int getFlightRage() {
        return flightRage;
    }

    public void setFlightRage(int flightRage) {
        this.flightRage = flightRage;
    }

    public int getFlightHeight() {
        return flightHeight;
    }

    public void setFlightHeight(int flightHeight) {
        this.flightHeight = flightHeight;
    }
}
