package by.itacademy.additionalTasks.inheritance.airline;

import by.itacademy.additionalTasks.inheritance.airline.aircraft.Aircraft;

import java.util.List;

public interface Countable {

    int calculateTotalCapacity(List<Aircraft> aircraftTreeSet);

    int calculateTotalLoadCapacity(List<Aircraft> aircraftTreeSet);
}
