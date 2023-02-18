package by.itacademy.additionalTasks.inheritance.publicTransportPark.electrictransport;

import by.itacademy.additionalTasks.inheritance.publicTransportPark.PublicTransport;

public class ElectricTransport extends PublicTransport {
    protected int powerConsumption;

    public ElectricTransport(int transportCost, boolean isRide, int powerConsumption) {
        super(transportCost, isRide);
        this.powerConsumption = powerConsumption;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
