package by.itacademy.homework3;

import by.itacademy.homework3.car.*;
import by.itacademy.homework3.service.ColorService;
import by.itacademy.homework3.service.OptionService;
import by.itacademy.homework3.service.WheelService;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Options> options = new ArrayList<>();
        options.add(Options.DOOR_CLOSER);
        ColorService colorService = new ColorService();
        WheelService wheelService = new WheelService();
        OptionService optionService = new OptionService();

        Car car = new Car(CarBrand.AUDI,
                CarColor.BLACK,
                CarEngine.B4204T26,
                CarWheelSize.MIDDLE,
                options);

        System.out.println(car.getCarColor());
        colorService.change(car, "White");
        System.out.println(car.getCarColor());

        System.out.println(car.getWheelSize());
        wheelService.change(car, "19");
        System.out.println(car.getWheelSize());

        System.out.println(car.getOptions());
        optionService.removeOption(car, Options.DOOR_CLOSER);
        System.out.println(car.getOptions());
        optionService.addOption(car, Options.CRUISE_CONTROL);
        System.out.println(car.getOptions());
    }
}
