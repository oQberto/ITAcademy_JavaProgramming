package by.itacademy.homework3.service;

import by.itacademy.homework3.car.Car;
import by.itacademy.homework3.car.Options;

import java.util.List;

public class OptionService {

    public void addOption(Car car, Options option) {
        car.getOptions().add(option);
    }

    public void removeOption(Car car, Options option) {
        car.getOptions().remove(option);
    }

    public void change(Car car, List<Options> newOptions) {
        car.getOptions().clear();
        car.setOptions(newOptions);
    }
}
