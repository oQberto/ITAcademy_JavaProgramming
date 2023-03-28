import by.itacademy.homework4.car.Car;
import by.itacademy.homework4.car.Truck;
import by.itacademy.homework4.car.enums.truckenums.*;
import by.itacademy.homework4.order.TruckOrder;
import by.itacademy.homework4.showroom.Showroom;
import by.itacademy.homework4.validation.exception.SetArgumentException;

import java.io.*;
import java.time.LocalDateTime;

public class Main {
    static String path = "D:\\Java Projects\\ITAcademy_JavaProgramming\\src\\by\\itacademy\\cars";

    public static void main(String[] args) throws IOException, InterruptedException, SetArgumentException {
        LocalDateTime localDateTime = LocalDateTime.now().withNano(0);
        Showroom showroom = new Showroom();
        TruckOrder order = new TruckOrder(
                2023, TruckBrand.NISSAN, TruckEngine.COMMON_RAIL, TruckColor.WHITE,
                TruckWheelSize.SMALL, null, 13
        );
        Truck truck = showroom.orderTruck(order);
        System.out.println(truck);
        showroom.addOption(truck, TruckOptions.DOOR_CLOSER);
        System.out.println(truck);
    }

    public static void writer(LocalDateTime localDateTime, Car car) {
        try (FileWriter fileWriter = new FileWriter(path, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            Thread.sleep(2000);
            printWriter.printf("%s ordered: %s \n", localDateTime, car);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}