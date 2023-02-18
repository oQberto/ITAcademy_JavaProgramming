package by.itacademy.additionalTasks.inheritance.publicTransportPark.fueltransport;

import by.itacademy.additionalTasks.inheritance.publicTransportPark.PublicTransport;

public class FuelTransport extends PublicTransport {
    protected int fuelConsumption;

    public FuelTransport(int transportCost, boolean isRide, int fuelConsumption) {
        super(transportCost, isRide);
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
