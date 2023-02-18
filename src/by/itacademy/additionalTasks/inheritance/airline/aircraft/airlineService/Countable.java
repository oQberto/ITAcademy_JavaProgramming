package by.itacademy.additionalTasks.inheritance.airline.aircraft.airlineService;

import by.itacademy.additionalTasks.inheritance.airline.aircraft.Aircraft;

import java.util.List;
import java.util.TreeSet;

public interface Countable {

    int calculateTotalCapacity(List<Aircraft> aircraftTreeSet);

    int calculateTotalLoadCapacity(List<Aircraft> aircraftTreeSet);
}
