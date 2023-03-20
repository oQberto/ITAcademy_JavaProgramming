package by.itacademy.homework4.service;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.Option;
import static by.itacademy.homework4.validation.Validator.*;

import java.util.List;

public class OptionService implements Changeable<List<Option>> {

    public void addOption(Car car, Option option) {
        isNullCar(car);
        isNullOption(option);

        car.getOptions().add(option);
    }

    public void removeOption(Car car, Option option) {
        isNullCar(car);
        isNullOption(option);

        car.getOptions().remove(option);
    }

    @Override
    public void change(Car car, List<Option> options) {
        isNullCar(car);

        if (options != null) {
            car.setOptions(options);
        }
    }
}
