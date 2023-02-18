package by.itacademy.additionalTasks.inheritance.airline;

import by.itacademy.additionalTasks.inheritance.airline.aircraft.airlineService.AirlineService;
import by.itacademy.additionalTasks.inheritance.airline.airlineGarage.AirlineGarage;

public class Airline {
    static AirlineGarage airlineGarage = new AirlineGarage();
    static AirlineService airlineService = new AirlineService();

    public static void main(String[] args) {
    }
}
