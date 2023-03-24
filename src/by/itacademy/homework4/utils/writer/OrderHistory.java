package by.itacademy.homework4.utils.writer;

import by.itacademy.homework4.car.Car;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class OrderHistory {
    private static final String ORDER_HISTORY_PATH = "D:\\Java Projects\\ITAcademy_JavaProgramming\\src\\by\\itacademy\\homework4\\writer\\OrderHistory";
    private static LocalDateTime localDateTime;


    private OrderHistory() {
    }

    public static void writeOrder(Car car) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(ORDER_HISTORY_PATH));
        localDateTime = LocalDateTime.now().withNano(0);
        printWriter.printf("%s ordered %s \n", localDateTime, car);
    }
}
