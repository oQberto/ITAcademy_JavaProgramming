package by.itacademy.additionalTasks.inheritance.airline.aircraft.helicopter;

import by.itacademy.additionalTasks.inheritance.airline.aircraft.quadcopter.Quadcopter;

public class Helicopter extends Quadcopter {
    private HelicopterBrand helicopterBrand;

    public Helicopter(int flightRage, int flightHeight, int capacity,
                      int loadCapacity, HelicopterBrand helicopterBrand) {
        super(flightRage, flightHeight, capacity, loadCapacity);
        this.helicopterBrand = helicopterBrand;
    }

    @Override
    public String toString() {
        return super.toString() + ". Helicopter{ " +
                "helicopterBrand=" + helicopterBrand +
                " }";
    }

    public HelicopterBrand getHelicopterBrand() {
        return helicopterBrand;
    }

    public void setHelicopterBrand(HelicopterBrand helicopterBrand) {
        this.helicopterBrand = helicopterBrand;
    }
}
