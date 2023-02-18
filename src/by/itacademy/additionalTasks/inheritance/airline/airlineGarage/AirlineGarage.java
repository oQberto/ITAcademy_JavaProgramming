package by.itacademy.additionalTasks.inheritance.airline.airlineGarage;

import by.itacademy.additionalTasks.inheritance.airline.aircraft.Aircraft;
import by.itacademy.additionalTasks.inheritance.airline.aircraft.AircraftComparator;

import java.util.TreeSet;

public class AirlineGarage {
    private final AircraftComparator aircraftComparator = new AircraftComparator();
    private TreeSet<Aircraft> aircraftTreeSet = new TreeSet<>(aircraftComparator);

    public void addAircraftToGarage(Aircraft aircraft) {
        aircraftTreeSet.add(aircraft);
    }

    public TreeSet<Aircraft> getAircraftTreeSet() {
        return aircraftTreeSet;
    }

    public void setAircraftTreeSet(TreeSet<Aircraft> aircraftTreeSet) {
        this.aircraftTreeSet = aircraftTreeSet;
    }
}
