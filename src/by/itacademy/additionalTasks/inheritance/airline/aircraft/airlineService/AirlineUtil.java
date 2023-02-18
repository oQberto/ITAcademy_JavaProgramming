package by.itacademy.additionalTasks.inheritance.airline.aircraft.airlineService;

import by.itacademy.additionalTasks.inheritance.airline.aircraft.Aircraft;
import by.itacademy.additionalTasks.inheritance.airline.aircraft.AircraftComparator;

import java.util.ArrayList;
import java.util.List;

public class AirlineUtil implements Countable {
    private final AircraftComparator aircraftComparator = new AircraftComparator();
    private final List<Aircraft> aircraftList = new ArrayList<>();

    public List<Aircraft> getAircraftByFlightRage(List<Aircraft> aircraftTreeSet, int flightRage) {
        aircraftList.clear();
        for (Aircraft aircraft : aircraftTreeSet) {
            if (aircraft.getFlightRage() == flightRage) {
                aircraftList.add(aircraft);
            }
        }
        return aircraftList;
    }

    public List<Aircraft> getAircraftByCapacity(List<Aircraft> aircraftTreeSet, int capacity) {
        aircraftList.clear();
        for (Aircraft aircraft : aircraftTreeSet) {
            if (aircraft.getCapacity() == capacity) {
                aircraftList.add(aircraft);
            }
        }
        return aircraftList;
    }

    public List<Aircraft> getAircraftByLoadCapacity(List<Aircraft> aircraftTreeSet, int loadCapacity) {
        aircraftList.clear();
        for (Aircraft aircraft : aircraftTreeSet) {
            if (aircraft.getLoadCapacity() == loadCapacity) {
                aircraftList.add(aircraft);
            }
        }
        return aircraftList;
    }

    public List<Aircraft> sort(List<Aircraft> aircraftList) {
        aircraftList.sort(aircraftComparator);
        return aircraftList;
    }

    @Override
    public int calculateTotalCapacity(List<Aircraft> aircraftTreeSet) {
        int totalCapacity = 0;
        for (Aircraft aircraft : aircraftTreeSet) {
            totalCapacity += aircraft.getCapacity();
        }
        return totalCapacity;
    }

    @Override
    public int calculateTotalLoadCapacity(List<Aircraft> aircraftTreeSet) {
        int totalLoadCapacity = 0;
        for (Aircraft aircraft : aircraftTreeSet) {
            totalLoadCapacity += aircraft.getLoadCapacity();
        }
        return totalLoadCapacity;
    }
}
