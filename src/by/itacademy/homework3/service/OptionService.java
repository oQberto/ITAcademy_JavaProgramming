package by.itacademy.homework3.service;

import by.itacademy.homework3.car.Car;
import by.itacademy.homework3.car.Options;

import java.util.Collection;

public class OptionService implements Changeable {

    public void addOption(Car car, Options option) {
        car.getOptions().add(option);
    }

    public void removeOption(Car car, Options option) {
        car.getOptions().remove(option);
    }

    @Override
    public void change(Car car, String option) {
        car.getOptions().clear();
        car.getOptions().add(Options.valueOf(option));
    }
}
