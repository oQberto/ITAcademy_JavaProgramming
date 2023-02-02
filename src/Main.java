import by.itacademy.homework2.task4.Car;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "Black");
        Car bmw = new Car("BMW", "Blue");
        Car kia = new Car("KIA", "Purple");

        audi.changeCarColor("Blue");
        bmw.changeCarColor("Black");
        kia.changeCarColor("Yellow");

        Car[] cars = {audi, bmw, kia};
        printArray(cars);
    }

    private static void printArray(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}