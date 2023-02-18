package by.itacademy.additionalTasks.inheritance.publicTransportPark;

import java.util.ArrayList;
import java.util.List;

public class PublicTransportGarage {
    private List<PublicTransport> publicTransportList = new ArrayList<>();

    {
        publicTransportList.add(new Bus(120, 20, true));
        publicTransportList.add(new Minibus(100, 15, false));
        publicTransportList.add(new Trolleybus(210, 35, true));
    }

    public void addTransportInGarage(PublicTransport publicTransport) {
        publicTransportList.add(publicTransport);
    }

    public List<PublicTransport> getPublicTransportList() {
        return publicTransportList;
    }

    public void setPublicTransportList(List<PublicTransport> publicTransportList) {
        this.publicTransportList = publicTransportList;
    }
}
