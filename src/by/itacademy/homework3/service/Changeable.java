package by.itacademy.homework3.service;

import by.itacademy.homework3.car.Car;

public interface Changeable<T> {
   void change (Car car, T variation);
}
