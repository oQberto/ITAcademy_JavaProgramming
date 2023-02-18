package by.itacademy.additionalTasks.inheritance.airline.aircraft.airlineService;

import by.itacademy.additionalTasks.inheritance.airline.aircraft.Aircraft;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class AirlineService implements Countable {
    private final List<Aircraft> aircraftList = new ArrayList<>();

    public List<Aircraft> getAircraftByFlightRage(TreeSet<Aircraft> aircraftTreeSet, int flightRage) {
        aircraftList.clear();
        for (Aircraft aircraft : aircraftTreeSet) {
            if (aircraft.getFlightRage() == flightRage) {
                aircraftList.add(aircraft);
            }
        }
        return aircraftList;
    }

    public List<Aircraft> getAircraftByCapacity(TreeSet<Aircraft> aircraftTreeSet, int capacity) {
        aircraftList.clear();
        for (Aircraft aircraft : aircraftTreeSet) {
            if (aircraft.getFlightRage() == capacity) {
                aircraftList.add(aircraft);
            }
        }
        return aircraftList;
    }

    public List<Aircraft> getAircraftByLoadCapacity(TreeSet<Aircraft> aircraftTreeSet, int loadCapacity) {
        aircraftList.clear();
        for (Aircraft aircraft : aircraftTreeSet) {
            if (aircraft.getLoadCapacity() == loadCapacity) {
                aircraftList.add(aircraft);
            }
        }
        return aircraftList;
    }

    @Override
    public int calculateTotalCapacity(TreeSet<Aircraft> aircraftTreeSet) {
        int totalCapacity = 0;
        for (Aircraft aircraft : aircraftTreeSet) {
            totalCapacity += aircraft.getCapacity();
        }
        return totalCapacity;
    }

    @Override
    public int calculateTotalLoadCapacity(TreeSet<Aircraft> aircraftTreeSet) {
        int totalLoadCapacity = 0;
        for (Aircraft aircraft : aircraftTreeSet) {
            totalLoadCapacity += aircraft.getLoadCapacity();
        }
        return totalLoadCapacity;
    }
}
