package by.itacademy.homework4;

import by.itacademy.homework4.car.Truck;
import by.itacademy.homework4.car.enums.Options;
import by.itacademy.homework4.car.enums.truckenums.*;
import by.itacademy.homework4.factory.CarFactory;
import by.itacademy.homework4.factory.SpecialCarFactory;
import by.itacademy.homework4.factory.TruckFactory;
import by.itacademy.homework4.order.Order;
import by.itacademy.homework4.order.TruckOrder;
import by.itacademy.homework4.service.ColorService;
import by.itacademy.homework4.service.OptionService;
import by.itacademy.homework4.service.WheelService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory;
        Truck truck = null;
        Order order = null;
        ColorService colorService = new ColorService();
        OptionService optionService = new OptionService();
        WheelService wheelService = new WheelService();
        List<Options> list = new ArrayList<>();
        list.add(TruckOptions.CRUISE_CONTROL);
        List<Options> list1 = new ArrayList<>();
        list1.add(TruckOptions.DOOR_CLOSER);
        list1.add(TruckOptions.SETTINGS_MEMORY);
        Scanner IN = new Scanner(System.in);
        String input = IN.nextLine();

        if (input.equals("truck")) {
            carFactory = new TruckFactory();
            System.out.println(carFactory.getCarsInStock());
            order = new TruckOrder(2023, TruckBrand.VOLVO, TruckEngine.COMMON_RAIL, TruckColor.WHITE,
                    TruckWheelSize.SMALL, null, LoadCapacity.SMALL);
            truck = (Truck) carFactory.createCar(order);
            System.out.println(truck);
            System.out.println(carFactory.getCarsInStock());
        } else if (input.equals("sp")) {
            carFactory = new SpecialCarFactory();
            System.out.println(carFactory.getCarsInStock());

            System.out.println(carFactory.getCarsInStock());
        }
    }
}
