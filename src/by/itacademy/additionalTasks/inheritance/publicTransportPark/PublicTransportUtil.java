package by.itacademy.additionalTasks.inheritance.publicTransportPark;

import java.util.ArrayList;
import java.util.List;

public class PublicTransportUtil implements Countable {
    private final PublicTransportComparator publicTransportComparator = new PublicTransportComparator();
    private final List<PublicTransport> publicTransportList = new ArrayList<>();

    public void getPublicTransportByCost(List<PublicTransport> publicTransportList, int cost) {
        this.publicTransportList.clear();
        for (PublicTransport publicTransport : publicTransportList) {
            if (publicTransport.getTransportCost() == cost) {
                this.publicTransportList.add(publicTransport);
            }
        }
    }

    public void getPublicTransportByConsumption(List<PublicTransport> publicTransportList, int consumption) {
        this.publicTransportList.clear();
        for (PublicTransport publicTransport : publicTransportList) {
            if (publicTransport.getConsumption() == consumption) {
                this.publicTransportList.add(publicTransport);
            }
        }
    }

    public void publicTransportIsRide(List<PublicTransport> publicTransportList) {
        this.publicTransportList.clear();
        for (PublicTransport publicTransport : publicTransportList) {
            if (publicTransport.isRide()) {
                this.publicTransportList.add(publicTransport);
            }
        }
    }

    public void sort(List<PublicTransport> publicTransportList) {
        publicTransportList.sort(publicTransportComparator);
    }

    @Override
    public int calculateParkCost(List<PublicTransport> publicTransportList) {
        int parkCost = 0;
        for (PublicTransport publicTransport : publicTransportList) {
            parkCost += publicTransport.getTransportCost();
        }
        return parkCost;
    }

    public List<PublicTransport> getPublicTransportList() {
        return publicTransportList;
    }
}
