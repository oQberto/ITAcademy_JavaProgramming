package by.itacademy.additionalTasks.inheritance.airline.aircraft;

public abstract class Aircraft {
    protected int flightRage;
    protected int flightHeight;
    protected int capacity;
    protected int loadCapacity;

    public Aircraft(int flightRage, int flightHeight, int capacity, int loadCapacity) {
        this.flightRage = flightRage;
        this.flightHeight = flightHeight;
        this.capacity = capacity;
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Aircraft{ " +
                "flightRage=" + flightRage +
                ", flightHeight=" + flightHeight +
                ", capacity=" + capacity +
                ", loadCapacity=" + loadCapacity +
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
