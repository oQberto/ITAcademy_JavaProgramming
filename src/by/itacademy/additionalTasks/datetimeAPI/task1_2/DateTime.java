package by.itacademy.additionalTasks.datetimeAPI.task1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTime {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(dateTime.isDateOdd(bf.readLine()));
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date! Example: January 02 2023");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isDateOdd(String date) {
        LocalDate localDate = LocalDate.parse(
                date,
                DateTimeFormatter
                        .ofPattern("MMMM dd yyyy")
        );
        LocalDate startOfYear =
                localDate
                .withMonth(1)
                .withDayOfMonth(1);

        return Period.between(startOfYear, localDate).getDays() % 2 == 0;
    }
}
