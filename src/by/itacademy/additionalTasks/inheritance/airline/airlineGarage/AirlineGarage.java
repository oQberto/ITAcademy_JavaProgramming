package by.itacademy.additionalTasks.inheritance.airline.airlineGarage;

import by.itacademy.additionalTasks.inheritance.airline.aircraft.Aircraft;
import by.itacademy.additionalTasks.inheritance.airline.aircraft.quadcopter.Quadcopter;
import by.itacademy.additionalTasks.inheritance.airline.aircraft.airplane.Airplane;
import by.itacademy.additionalTasks.inheritance.airline.aircraft.airplane.AirplaneBrand;
import by.itacademy.additionalTasks.inheritance.airline.aircraft.helicopter.Helicopter;
import by.itacademy.additionalTasks.inheritance.airline.aircraft.helicopter.HelicopterBrand;

import java.util.ArrayList;
import java.util.List;

public class AirlineGarage {
    private List<Aircraft> aircraftTreeSet = new ArrayList<>();

    {
        aircraftTreeSet.add(new Airplane(5000, 10500, 225, 45,
                AirplaneBrand.AIRBUS));
        aircraftTreeSet.add(new Airplane(4000, 12500, 300, 25,
                AirplaneBrand.BOEING));
        aircraftTreeSet.add(new Helicopter(450, 10500, 225, 45,
                HelicopterBrand.AIRBUS));
        aircraftTreeSet.add(new Helicopter(500, 10500, 4, 25,
                HelicopterBrand.BELL));
        aircraftTreeSet.add(new Quadcopter(45, 500, 0, 12));
    }

    public void addAircraftToGarage(Aircraft aircraft) {
        aircraftTreeSet.add(aircraft);
    }

    public List<Aircraft> getAircraftList() {
        return aircraftTreeSet;
    }

    public void setAircraftList(List<Aircraft> aircraftTreeSet) {
        this.aircraftTreeSet = aircraftTreeSet;
    }
}
