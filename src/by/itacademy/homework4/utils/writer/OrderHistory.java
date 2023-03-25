package by.itacademy.homework4.utils.writer;

import by.itacademy.homework4.car.Car;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.stream.Stream;

public class OrderHistory {
    private static final String ORDER_HISTORY_PATH = "D:\\Java Projects\\ITAcademy_JavaProgramming\\src\\by\\itacademy\\homework4\\writer\\OrderHistory";

    private OrderHistory() {
    }

    public static void writeOrderToFile(Car car) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(ORDER_HISTORY_PATH));
        LocalDateTime localDateTime = LocalDateTime.now().withNano(0);
        printWriter.printf("%s ordered %s \n", localDateTime, car);
    }

    public static void findCarsInHistoryByBrand(String brand) {
        try (Stream<String> lines = Files.lines(Paths.get(ORDER_HISTORY_PATH))) {
            lines.filter(line -> line.contains(brand)).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findCarsInHistoryByYear(int issueYear) {
        try (Stream<String> lines = Files.lines(Paths.get(ORDER_HISTORY_PATH))) {
            lines.filter(line -> line.contains(String.valueOf(issueYear))).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findCarsInHistoryByDate(LocalDate localDate) {
        try (Stream<String> lines = Files.lines(Paths.get(ORDER_HISTORY_PATH))) {
            lines.filter(line -> line.contains(String.valueOf(localDate))).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
