package by.itacademy.homework4.service;

import by.itacademy.homework4.car.Car;

public interface Changeable<T> {
    void change(Car car, T variation);
}
