package by.itacademy.homework3.carFactory;

import by.itacademy.homework3.car.*;

import java.util.ArrayList;
import java.util.List;

public class FactoryStock {
    private final List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car(CarBrand.AUDI, CarColor.BLACK,
                CarEngine.V8_TFSI, CarWheelSize.MIDDLE));
        cars.add(new Car(CarBrand.KIA, CarColor.YELLOW,
                CarEngine.B4204T26, CarWheelSize.SMALL));
        cars.add(new Car(CarBrand.VOLVO, CarColor.RED,
                CarEngine.T6_AWD, CarWheelSize.LARGE));
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public Car getCar(Car car) {
        for (Car car1 : cars) {
            if (car1.equals(car)) {
                return car1;
            }
        }
        return null;
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
