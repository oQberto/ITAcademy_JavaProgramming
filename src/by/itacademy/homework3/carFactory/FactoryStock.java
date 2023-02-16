package by.itacademy.homework3.carFactory;

import by.itacademy.homework3.car.*;

import java.util.ArrayList;
import java.util.List;

public class FactoryStock {
    private final List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car(CarBrand.AUDI, CarEngine.B4204T26, 2008,
                CarColor.BLACK, CarWheelSize.MIDDLE));
        cars.add(new Car(CarBrand.KIA, CarEngine.G4KM_MPI, 2010,
                CarColor.RED, CarWheelSize.SMALL));
        cars.add(new Car(CarBrand.VOLVO, CarEngine.T6_AWD, 2012,
                CarColor.YELLOW, CarWheelSize.LARGE));
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
