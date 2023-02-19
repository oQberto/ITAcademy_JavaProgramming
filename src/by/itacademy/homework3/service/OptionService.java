package by.itacademy.homework3.service;

import by.itacademy.homework3.car.Car;
import by.itacademy.homework3.car.Options;

import java.util.List;

public class OptionService implements Changeable<List<Options>> {

    public void addOption(Car car, Options option) {
        car.getOptions().add(option);
    }

    public void removeOption(Car car, Options option) {
        car.getOptions().remove(option);
    }

    @Override
    public void change(Car car, List<Options> options) {
        if (car != null && options != null) {
            car.setOptions(options);
        }
    }
}
