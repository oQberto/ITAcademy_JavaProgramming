import by.itacademy.additionalTasks.fraction.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(7, 8);
        System.out.println(fraction.printFraction());
        System.out.println(Math.round(1.2 % 1));
        System.out.println(fraction.divide(1.2));
    }
}