package by.itacademy.homework3;

import by.itacademy.homework3.car.Car;
import by.itacademy.homework3.car.CarColor;
import by.itacademy.homework3.car.CarWheelSize;
import by.itacademy.homework3.car.specialcar.CarBrand;
import by.itacademy.homework3.car.specialcar.CarEngine;
import by.itacademy.homework3.car.specialcar.CarType;
import by.itacademy.homework3.car.specialcar.SpecialCar;
import by.itacademy.homework3.carFactory.specialcarsfactory.SpecialCarsFactory;
import by.itacademy.homework3.carShowroom.CarShowroom;
import by.itacademy.homework3.carShowroom.Order;

public class Test {
    public static void main(String[] args) {
        CarShowroom<SpecialCar> carShowroom = new CarShowroom<>(new SpecialCarsFactory());
        Order clientOrder = new Order(CarType.FIRE_CAR, CarBrand.FORD, CarEngine.GAS_ENGINE,
                2012, CarColor.WHITE, CarWheelSize.MIDDLE);
        Car clientCar = carShowroom.orderCar(clientOrder);
        System.out.println(clientCar + "\n");
        carShowroom.getCarFactory().showWorkShopCatalogue(carShowroom.getCarFactory().getCarsInStock());
    }
}
