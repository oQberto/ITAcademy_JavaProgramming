package by.itacademy.additionalTasks.inheritance.airline.aircraft;

import java.util.Comparator;

public class AircraftComparator implements Comparator<Aircraft> {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return Integer.compare(o1.getFlightHeight(), o2.getFlightHeight());
    }
}
