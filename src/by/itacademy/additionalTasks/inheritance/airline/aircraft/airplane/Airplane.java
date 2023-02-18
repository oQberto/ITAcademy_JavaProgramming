package by.itacademy.additionalTasks.inheritance.airline.aircraft.airplane;

import by.itacademy.additionalTasks.inheritance.airline.aircraft.Aircraft;

public class Airplane extends Aircraft {
    private AirplaneBrand airplaneBrand;

    public Airplane(int flightRage, int flightHeight, int capacity,
                    int loadCapacity, AirplaneBrand airplaneBrand) {
        super(flightRage, flightHeight, capacity, loadCapacity);
        this.airplaneBrand = airplaneBrand;
    }

    @Override
    public String toString() {
        return super.toString() + ". Airplane{ " +
                "airplaneBrand=" + airplaneBrand +
                " }";
    }

    public AirplaneBrand getAirplaneBrand() {
        return airplaneBrand;
    }

    public void setAirplaneBrand(AirplaneBrand airplaneBrand) {
        this.airplaneBrand = airplaneBrand;
    }
}
