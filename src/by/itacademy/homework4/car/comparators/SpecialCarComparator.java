package by.itacademy.homework4.car.comparators;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.SpecialCar;
import by.itacademy.homework4.order.Order;
import by.itacademy.homework4.order.SpecialCarOrder;

public class SpecialCarComparator extends Comparator {
    @Override
    public boolean compare(Car car, Order order) {
        if (super.compare(car, order) &&
                ((SpecialCar) car).getSpecialCarType() == ((SpecialCarOrder) order).getSpecialCarType()) {
            return true;
        }
        return super.compare(car, order);
    }
}
