package by.itacademy.homework3.carFactory.truckcarfactory;

import by.itacademy.homework3.car.truck.Truck;
import by.itacademy.homework3.carFactory.CarFactory;
import by.itacademy.homework3.carFactory.FactoryStock;
import by.itacademy.homework3.carShowroom.Order;

import java.util.LinkedList;
import java.util.List;

public class TruckFactory extends CarFactory<Truck> {
    private List<Truck> trucksInStock;
    private final FactoryStock<Truck> factoryStock;

    public TruckFactory() {
        fillStock();
        this.factoryStock = new FactoryStock<>(trucksInStock);
    }

    @Override
    public Truck createCar(Order order) {
        return null;
    }

    @Override
    protected Truck replaceInappropriateOptions(Truck moreSuitableCar, Order clientOrder) {
        if (moreSuitableCar == null || clientOrder == null) return null;
        if (!(moreSuitableCar.getCarColor().equals(clientOrder.getCarColor()))) {
            moreSuitableCar.setCarColor(clientOrder.getCarColor());
        }
        if (!(moreSuitableCar.getWheelSize().equals(clientOrder.getWheelSize()))) {
            moreSuitableCar.setWheelSize(clientOrder.getWheelSize());
        }
        if (moreSuitableCar.getOptions().size() == 0
                || moreSuitableCar.getOptions().equals(clientOrder.getOptions())) {
            moreSuitableCar.setOptions(clientOrder.getOptions());
        }
        return moreSuitableCar;
    }

    @Override
    protected void fillStock() {
        trucksInStock = new LinkedList<>();
    }

    @Override
    public List<Truck> getCarsInStock() {
        return trucksInStock;
    }
}
