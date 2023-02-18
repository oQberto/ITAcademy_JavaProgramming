package by.itacademy.additionalTasks.inheritance.airline.aircraft.airlineService;

import by.itacademy.additionalTasks.inheritance.airline.aircraft.Aircraft;

import java.util.TreeSet;

public interface Countable {

    int calculateTotalCapacity(TreeSet<Aircraft> aircraftTreeSet);

    int calculateTotalLoadCapacity(TreeSet<Aircraft> aircraftTreeSet);
}
