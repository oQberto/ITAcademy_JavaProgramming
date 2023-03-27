package by.itacademy.homework4.car.comparators;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.PassengerCar;
import by.itacademy.homework4.order.Order;
import by.itacademy.homework4.order.PassengerCarOrder;

public class PassengerCarComparator extends Comparator {
    @Override
    public boolean compare(Car car, Order order) {
        if (super.compare(car, order) &&
                ((PassengerCar) car).getPassengerCarFuelType() ==
                        ((PassengerCarOrder) order).getPassengerCarFuelType()) {
            return true;
        }
        return super.compare(car, order);
    }
}
