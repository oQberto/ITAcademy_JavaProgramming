package by.itacademy.additionalTasks.inheritance.publicTransportPark;

import by.itacademy.additionalTasks.inheritance.publicTransportPark.electrictransport.Tram;
import by.itacademy.additionalTasks.inheritance.publicTransportPark.electrictransport.Trolleybus;
import by.itacademy.additionalTasks.inheritance.publicTransportPark.fueltransport.Bus;
import by.itacademy.additionalTasks.inheritance.publicTransportPark.fueltransport.Minibus;

import java.util.ArrayList;
import java.util.List;

public class PublicTransportGarage {
    private List<PublicTransport> publicTransportList = new ArrayList<>();

    {
        publicTransportList.add(new Bus(120, true, 20));
        publicTransportList.add(new Minibus(100, false, 15));
        publicTransportList.add(new Trolleybus(210, false, 35));
        publicTransportList.add(new Tram(350, true, 50));
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
