package by.itacademy.homework3.carFactory;

import by.itacademy.homework3.car.*;
import by.itacademy.homework3.carShowroom.Order;

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

    static Car carForClient = null;
    protected boolean checkCarInTheStock(Order clientOrder) {
        boolean isCar = false;
        for (Car car : cars) {
            if (clientOrder.equals(car)) {
                isCar = true;
                carForClient = car;
                cars.remove(car);

            }
        }
        return isCar;
    }

    protected Car chooseMoreSuitableCar(Order clientOrder) {
        Car moreSuitableCar = null;
        int count = 0;
        int maxMatches = 0;

        for (Car car : cars) {
            if (car.getCarBrand().equals(clientOrder.getCarBrand())
                    && car.getCarEngine().equals(clientOrder.getCarEngine())
                    && car.getIssueYear() == clientOrder.getIssueYear()) {
                count++;

                if (car.getCarColor().equals(clientOrder.getCarColor())) {
                    count++;
                }
                if (car.getWheelSize().equals(clientOrder.getWheelSize())) {
                    count++;
                }
            }
            if (count > maxMatches) {
                moreSuitableCar = car;
                maxMatches = count;
            }
            count = 0;
        }
        cars.remove(moreSuitableCar);
        return moreSuitableCar;
    }

    public void addCar(Car car) {
        cars.add(car);
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
