package by.itacademy.homework4;

import by.itacademy.homework4.car.SpecialCar;
import by.itacademy.homework4.car.Truck;
import by.itacademy.homework4.car.markerinterfaces.Option;
import by.itacademy.homework4.car.enums.truckenums.*;
import by.itacademy.homework4.factory.CarFactory;
import by.itacademy.homework4.order.Order;
import by.itacademy.homework4.order.TruckOrder;
import by.itacademy.homework4.service.ColorService;
import by.itacademy.homework4.service.OptionService;
import by.itacademy.homework4.service.WheelService;
import by.itacademy.homework4.utils.showroom.Showroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory;
        Truck truck = null;
        Truck truck1 = null;
        SpecialCar specialCar;
        Order truckOrder = null;
        ColorService colorService = new ColorService();
        OptionService optionService = new OptionService();
        WheelService wheelService = new WheelService();
        List<Option> list = new ArrayList<>();
        list.add(TruckOptions.CRUISE_CONTROL);
        List<Option> list1 = new ArrayList<>();
        list1.add(TruckOptions.DOOR_CLOSER);
        list1.add(TruckOptions.SETTINGS_MEMORY);
        Scanner IN = new Scanner(System.in);
        String input = IN.nextLine();
//            carFactory = new TruckFactory();
//            System.out.println(carFactory.getCarsInStock());
            truckOrder = new TruckOrder(2023, TruckBrand.NISSAN, TruckEngine.COMMON_RAIL, TruckColor.WHITE,
                    TruckWheelSize.SMALL, null, LoadCapacity.SMALL);
//            truck = (Truck) carFactory.createCar(order);
//            System.out.println(truck);
//            System.out.println(carFactory.getCarsInStock());
//            carFactory = new SpecialCarFactory();
//            System.out.println(carFactory.getCarsInStock());
//            order = new SpecialCarOrder(2023, SpecialCarBrand.FORD, SpecialCarEngine.COMMON_RAIL, SpecialCarColor.RED,
//                    SpecialCarWheelSize.MIDDLE, list, SpecialCarType.POLICE);
//            specialCar = (SpecialCar) carFactory.createCar(order);
//            System.out.println(specialCar);
//            System.out.println(carFactory.getCarsInStock());
        Showroom.showSpecialCarFactoryCatalogue();
        System.out.println(Showroom.createCar(truckOrder));

//        carFactory = new SpecialCarFactory();
//        order = new SpecialCarOrder(2023, SpecialCarBrand.FORD, SpecialCarEngine.COMMON_RAIL, SpecialCarColor.RED,
//                SpecialCarWheelSize.MIDDLE, list, SpecialCarType.POLICE);
//        specialCar = (SpecialCar) carFactory.createCar(order);
//        colorService.change(specialCar, SpecialCarColor.WHITE);
//        System.out.println(specialCar);
    }
}
