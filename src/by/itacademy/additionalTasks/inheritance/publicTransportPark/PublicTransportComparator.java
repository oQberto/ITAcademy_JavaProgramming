package by.itacademy.additionalTasks.inheritance.publicTransportPark;

import java.util.Comparator;

public class PublicTransportComparator implements Comparator<PublicTransport> {

    @Override
    public int compare(PublicTransport o1, PublicTransport o2) {
        return Integer.compare(o1.getConsumption(), o2.getConsumption());
    }
}
