package by.itacademy.homework4;

import by.itacademy.homework4.car.enums.CarBrand;
import by.itacademy.homework4.car.enums.CarColor;
import by.itacademy.homework4.car.enums.CarEngine;
import by.itacademy.homework4.car.enums.CarWheelSize;
import by.itacademy.homework4.factory.CarFactory;
import by.itacademy.homework4.factory.SpecialCarFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new SpecialCarFactory();

        System.out.println(carFactory.getCarsInStock());
        System.out.println(carFactory.createCar(2023, CarBrand.FORD, CarEngine.COMMON_RAIL, CarColor.BLACK,
                CarWheelSize.SMALL, new ArrayList<>()));
        System.out.println(carFactory.getCarsInStock());
    }
}
