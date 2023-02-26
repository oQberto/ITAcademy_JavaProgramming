package by.itacademy.homework3.carShowroom;

import by.itacademy.homework3.car.Car;
import by.itacademy.homework3.car.CarColor;
import by.itacademy.homework3.car.CarWheelSize;
import by.itacademy.homework3.car.Options;
import by.itacademy.homework3.carFactory.CarFactory;
import by.itacademy.homework3.service.*;

import java.util.List;

public class CarShowroom<T extends Car> {
    private final CarFactory<T> carFactory;
    private final ColorService colorService = new ColorService();
    private final WheelService wheelService = new WheelService();
    private final OptionService optionService = new OptionService();

    public CarShowroom(CarFactory<T> carFactory) {
        this.carFactory = carFactory;
    }

    public Car orderCar(Order clientOrder) {
        return carFactory.createCar(clientOrder);
    }

    public void changeColor(Car car, CarColor newCarColor) {
        colorService.change(car, newCarColor);
    }

    public void changeWheel(Car car, CarWheelSize newCarWheel) {
        wheelService.change(car, newCarWheel);
    }
    public void replaceOptions(Car car, List<Options> newCarOptions) {
        optionService.change(car, newCarOptions);
    }

    public void changeOption(Car car, Options option) {
        optionService.addOption(car, option);
    }

    public void removeOption(Car car, Options option) {
        optionService.removeOption(car, option);
    }

    public CarFactory<T> getCarFactory() {
        return carFactory;
    }
}
