package by.itacademy.homework3;

import by.itacademy.homework3.car.*;
import by.itacademy.homework3.carFactory.CarFactory;
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

        List<Options> options1 = new ArrayList<>();
        options1.add(Options.SETTINGS_MEMORY);
        options1.add(Options.TINTED_GLASS);

        Car car = new Car(CarBrand.AUDI,
                CarEngine.B4204T26,
                2008,
                CarColor.BLACK,
                CarWheelSize.MIDDLE);

        CarFactory carFactory = new CarFactory();
    }
}
