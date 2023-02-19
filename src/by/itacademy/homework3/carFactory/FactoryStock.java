package by.itacademy.homework3.carFactory;

import by.itacademy.homework3.car.*;
import by.itacademy.homework3.carShowroom.Order;

import java.util.ArrayList;
import java.util.List;

public class FactoryStock {
    private final List<Car> cars;

    public FactoryStock() {
        cars = new ArrayList<>();
        cars.add(new Car(CarBrand.AUDI, CarEngine.B4204T26, 2008,
                CarColor.BLACK, CarWheelSize.MIDDLE));
        cars.add(new Car(CarBrand.KIA, CarEngine.G4KM_MPI, 2010,
                CarColor.RED, CarWheelSize.SMALL));
        cars.add(new Car(CarBrand.VOLVO, CarEngine.T6_AWD, 2012,
                CarColor.YELLOW, CarWheelSize.LARGE));
    }

    public Car checkCar(Order order) {
        if (order == null) return null;
        Car clientCar = null;
        for (Car car : cars) {
            if (order.equals(car)) {
                clientCar = car;
            }
        }
        cars.remove(clientCar);
        return clientCar;
    }

    protected Car chooseMoreSuitableCar(Order order) {
        if (order == null) return null;
        Car moreSuitableCar = null;

        for (Car car : cars) {
            if (checkImmutableParams(car, order)) {
                moreSuitableCar = car;
            }
            if (checkImmutableParams(car, order)
                    && checkChangeableParams(car, order)) {
                moreSuitableCar = car;
            }
        }
        cars.remove(moreSuitableCar);
        return moreSuitableCar;
    }

    private boolean checkImmutableParams(Car car, Order order) {
        return car.getCarBrand().equals(order.getCarBrand())
                && car.getCarEngine().equals(order.getCarEngine())
                && car.getIssueYear() == order.getIssueYear();
    }

    private boolean checkChangeableParams(Car car, Order order) {
        if (car.getCarColor().equals(order.getCarColor())
                && car.getWheelSize().equals(order.getWheelSize())) {
            return true;
        }
        return car.getCarColor().equals(order.getCarColor());
    }

    public void showFactoryStock() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
