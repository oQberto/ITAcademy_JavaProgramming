package by.itacademy.homework4.service;

import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.validation.exception.SetArgumentException;

public interface Changeable<T> {
    void change(Car car, T variation) throws SetArgumentException;
}
