package by.itacademy.homework3.carFactory;

import by.itacademy.homework3.car.*;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    private final List<CarBrand> carBrandList = new ArrayList<>();
    private final List<CarEngine> carEngineList = new ArrayList<>();
    private final List<CarColor> carColorList = new ArrayList<>();
    private final List<CarWheelSize> carWheelSizeList = new ArrayList<>();
    private final FactoryStock factoryStock = new FactoryStock();

    {
        carBrandList.add(CarBrand.AUDI);
        carBrandList.add(CarBrand.KIA);
        carBrandList.add(CarBrand.VOLVO);

        carEngineList.add(CarEngine.B4204T26);
        carEngineList.add(CarEngine.G4KM_MPI);
        carEngineList.add(CarEngine.V6_TFSI);
        carEngineList.add(CarEngine.V8_TFSI);
        carEngineList.add(CarEngine.V6_TFSI);
        carEngineList.add(CarEngine.T5);

        carColorList.add(CarColor.BLUE);
        carColorList.add(CarColor.BLUE);
        carColorList.add(CarColor.GREEN);
        carColorList.add(CarColor.RED);
        carColorList.add(CarColor.WHITE);
        carColorList.add(CarColor.YELLOW);

        carWheelSizeList.add(CarWheelSize.SMALL);
        carWheelSizeList.add(CarWheelSize.MIDDLE);
        carWheelSizeList.add(CarWheelSize.LARGE);
    }

    public <T> void showWorkShopCatalogue(List<T> catalogue) {
        for (T t : catalogue) {
            System.out.println(t);
        }
    }

    public Car createCar(Car clientOrder) {
        return new Car(
                clientOrder.getCarBrand(),
                clientOrder.getCarColor(),
                clientOrder.getCarEngine(),
                clientOrder.getWheelSize());
    }

    public List<CarBrand> getCarBrandList() {
        return carBrandList;
    }

    public List<CarEngine> getCarEngineList() {
        return carEngineList;
    }

    private Car chooseMoreSuitableCar() {
        return null;
    }

    private void checkCarInTheStock() {

    }

    private void replaceInappropriateOptions() {

    }

    public List<CarColor> getCarColorList() {
        return carColorList;
    }

    public List<CarWheelSize> getCarWheelSizeList() {
        return carWheelSizeList;
    }

    public FactoryStock getFactoryStock() {
        return factoryStock;
    }
}
