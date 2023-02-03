import by.itacademy.homework2.task4.*;

public class Main {
    public static void main(String[] args) {
        CarColor black = CarColor.BLACK;
        CarModel audi = CarModel.AUDI;
        Car carAudi = new Car(audi, black);
        System.out.println(carAudi);
        carAudi.changeCarColor("Red");
        System.out.println(carAudi);

        System.out.println();

        CarModel bmw = CarModel.BMW;
        Car carBMW = new Car(bmw, black);
        System.out.println(carBMW);
        carBMW.changeCarColor("Purple");
        System.out.println(carBMW);

        System.out.println();

        CarModel kia = CarModel.KIA;
        Car carKIA = new Car(kia, black);
        System.out.println(carKIA);
        carKIA.changeCarColor("Yellow");
        System.out.println(carKIA);
    }
}