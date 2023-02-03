import by.itacademy.homework2.task5_9.RegEx;

public class Main {
    public static void main(String[] args) {
        String text = "4215-5689-9865-9878, kjfglkdsf, 4215-5689-9865-987DS8, as4215-5689-9865-9878, 1A22589-7859-7458-8521";
        System.out.println(RegEx.getCreditCardNumber(text));
    }
}