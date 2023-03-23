package by.itacademy.homework4.service;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.markerinterfaces.Option;

import static by.itacademy.homework4.validation.Message.NullMessages.*;

import java.util.List;

import static java.util.Objects.*;

public class OptionService implements Changeable<List<Option>> {

    public void addOption(Car car, Option option) {
        requireNonNull(car, NULL_CAR);
        requireNonNull(option, NULL_OPTION);

        car.getOptions().add(option);
    }

    public void removeOption(Car car, Option option) {
        requireNonNull(car, NULL_CAR);
        requireNonNull(option, NULL_OPTION);

        car.getOptions().remove(option);
    }

    @Override
    public void change(Car car, List<Option> options) {
        requireNonNull(car, NULL_CAR);

        if (options != null) {
            car.setOptions(options);
        }
    }
}
