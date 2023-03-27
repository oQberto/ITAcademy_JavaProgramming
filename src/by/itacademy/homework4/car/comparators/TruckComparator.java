package by.itacademy.homework4.car.comparators;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.Truck;
import by.itacademy.homework4.order.Order;
import by.itacademy.homework4.order.TruckOrder;

public class TruckComparator extends Comparator {
    @Override
    public boolean compare(Car car, Order order) {
        if (super.compare(car, order) &&
                ((Truck) car).getLoadCapacity() == ((TruckOrder) order).getLoadCapacity()) {
            return true;
        }
        return super.compare(car, order);
    }
}
