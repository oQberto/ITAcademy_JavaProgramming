package by.itacademy.homework4.service;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.enums.IOptions;

import java.util.List;

public class OptionService implements Changeable<List<IOptions>> {

    public void addOption(Car car, IOptions option) {
        car.getOptions().add(option);
    }

    public void removeOption(Car car, IOptions option) {
        car.getOptions().remove(option);
    }

    @Override
    public void change(Car car, List<IOptions> options) {
        if (car != null && options != null) {
            car.setOptions(options);
        }
    }
}
