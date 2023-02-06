import by.itacademy.additionalTasks.fraction.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(5, 6);
        System.out.println(fraction.printFraction());
        System.out.println(fraction.addition("3/4"));
    }
}