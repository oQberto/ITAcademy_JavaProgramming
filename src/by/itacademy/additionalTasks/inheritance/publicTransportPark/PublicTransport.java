package by.itacademy.additionalTasks.inheritance.publicTransportPark;

public class PublicTransport {
    protected int transportCost;
    protected int fuelConsumption;
    protected boolean isRide;

    public PublicTransport(int transportCost, int fuelConsumption, boolean isRide) {
        this.transportCost = transportCost;
        this.fuelConsumption = fuelConsumption;
        this.isRide = isRide;
    }

    @Override
    public String toString() {
        return "PublicTransport{ " +
                "transportCost=" + transportCost +
                ", fuelConsumption=" + fuelConsumption +
                ", isRide=" + isRide +
                " }";
    }

    public int getTransportCost() {
        return transportCost;
    }

    public void setTransportCost(int transportCost) {
        this.transportCost = transportCost;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public boolean isRide() {
        return isRide;
    }

    public void setRide(boolean ride) {
        isRide = ride;
    }
}
