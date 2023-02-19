package by.itacademy.homework3;

import by.itacademy.homework3.car.*;
import by.itacademy.homework3.carFactory.CarFactory;
import by.itacademy.homework3.carShowroom.CarShowroom;
import by.itacademy.homework3.carShowroom.Order;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CarShowroom carShowroom = new CarShowroom(new CarFactory());

        List<Options> options = new ArrayList<>();
        options.add(Options.CRUISE_CONTROL);
        Order clientOrder = new Order(CarBrand.KIA, CarEngine.G4KM_MPI, 2010,
                CarColor.WHITE, CarWheelSize.LARGE, options);
        Car clientCar = carShowroom.orderCar(clientOrder);
        System.out.println(clientCar + "\n");
        carShowroom.getCarFactory().getFactoryStock().showFactoryStock();

    }
}
