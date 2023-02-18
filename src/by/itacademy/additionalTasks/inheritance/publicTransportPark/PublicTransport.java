package by.itacademy.additionalTasks.inheritance.publicTransportPark;

public class PublicTransport {
    protected int transportCost;
    protected boolean isRide;

    public PublicTransport(int transportCost, boolean isRide) {
        this.transportCost = transportCost;
        this.isRide = isRide;
    }

    @Override
    public String toString() {
        return "PublicTransport{ " +
                "transportCost=" + transportCost +
                ", isRide=" + isRide +
                " }";
    }

    public int getTransportCost() {
        return transportCost;
    }

    public void setTransportCost(int transportCost) {
        this.transportCost = transportCost;
    }

    public boolean isRide() {
        return isRide;
    }

    public void setRide(boolean ride) {
        isRide = ride;
    }
}
