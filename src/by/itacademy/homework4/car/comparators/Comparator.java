package by.itacademy.homework4.car.comparators;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.order.Order;

public abstract class Comparator {
    public boolean compare(Car car, Order order) {
        if (compareWithOrderImmutableParams(car, order) &&
                car.getCarColor() == order.getColor() &&
                car.getWheelSize() == order.getWheelSize()) {
            return true;
        }  else if (compareWithOrderImmutableParams(car, order) &&
                car.getCarColor() == order.getColor() &&
                car.getWheelSize() == order.getWheelSize()) {
            return true;
        } else if (compareWithOrderImmutableParams(car, order) &&
                car.getCarColor() == order.getColor()) {
            return true;
        } else if (compareWithOrderImmutableParams(car, order) &&
                car.getWheelSize() == order.getWheelSize()) {
            return true;
        }
        return compareWithOrderImmutableParams(car, order);
    }

    private boolean compareWithOrderImmutableParams(Car car, Order order) {
        return car.getIssueYear() == order.getIssueYear() &&
                car.getCarBrand() == order.getBrand() &&
                car.getCarEngine() == order.getEngine();

    }
}
