package by.itacademy.homework4;

import by.itacademy.homework4.car.enums.CarBrand;
import by.itacademy.homework4.car.enums.CarColor;
import by.itacademy.homework4.car.enums.CarEngine;
import by.itacademy.homework4.car.enums.CarWheelSize;
import by.itacademy.homework4.factory.CarFactory;
import by.itacademy.homework4.factory.SpecialCarFactory;
import by.itacademy.homework4.factory.TruckFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory;
        Scanner IN = new Scanner(System.in);
        String input = IN.nextLine();

        if (input.equals("truck")) {
            carFactory = new TruckFactory();
            System.out.println(carFactory.getCarsInStock());
            System.out.println(carFactory.createCar(2023, CarBrand.VOLVO, CarEngine.COMMON_RAIL, CarColor.RED,
                    CarWheelSize.SMALL, new ArrayList<>()));
            System.out.println(carFactory.getCarsInStock());
        } else if (input.equals("sp")) {
            carFactory = new SpecialCarFactory();
            System.out.println(carFactory.getCarsInStock());
            System.out.println(carFactory.createCar(2023, CarBrand.FORD, CarEngine.COMMON_RAIL, CarColor.WHITE,
                    CarWheelSize.SMALL, new ArrayList<>()));
            System.out.println(carFactory.getCarsInStock());
        }
    }
}
