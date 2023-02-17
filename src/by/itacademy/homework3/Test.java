package by.itacademy.homework3;

import by.itacademy.homework3.car.*;
import by.itacademy.homework3.carFactory.CarFactory;
import by.itacademy.homework3.carShowroom.CarShowroom;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        CarShowroom carShowroom = new CarShowroom();
        List<Options> options = new ArrayList<>();
        options.add(Options.CRUISE_CONTROL);
        Car clientOrder = new Car(CarBrand.KIA, CarEngine.G4KM_MPI, 2010,
                CarColor.WHITE, CarWheelSize.LARGE, options);
        System.out.println(carFactory.getFactoryStock().getCars());
        carShowroom.orderCar(clientOrder);
        System.out.println(clientOrder);
        carShowroom.changeColor(clientOrder, CarColor.YELLOW);
        System.out.println(clientOrder);
        System.out.println();

        carShowroom.removeOption(clientOrder, Options.CRUISE_CONTROL);

        System.out.println(clientOrder);
    }
}
