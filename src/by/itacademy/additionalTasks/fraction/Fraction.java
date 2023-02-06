package by.itacademy.additionalTasks.fraction;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fraction {
    private static final String FRACTION_REGEXP = "(\\d?) ?/ ?([1-9]?)";
    private static final Pattern PATTERN = Pattern.compile(FRACTION_REGEXP);
    private static final int[] USER_FRACTION = new int[2];
    private int numerator;
    private int denominator;


    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String printFraction() {
        return numerator + "/" + denominator;
    }

    public String printFraction(int numerator, int denominator) {
        return numerator + "/" + denominator;
    }

    public String addition(String fractionTerm) {
        catchNumbers(fractionTerm);
        int newNumerator;
        int commonDenominator = getLeastCommonMultiply(denominator, USER_FRACTION[1]);

        numerator = (commonDenominator / denominator) * numerator;
        USER_FRACTION[0] = (commonDenominator / USER_FRACTION[1]) * USER_FRACTION[0];
        newNumerator = numerator + USER_FRACTION[0];
        return printFraction(newNumerator, commonDenominator);
    }

    public String multiply(double factor) {
        convertDecimalToCommonFraction(factor);
        numerator *= USER_FRACTION[0];
        denominator *= USER_FRACTION[1];
        return printFraction(numerator, denominator);
    }

    public String division(double divider) {
        return printFraction(0, 0);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    private static void catchNumbers(String fraction) {
        Matcher matcher = PATTERN.matcher(fraction);
        if (matcher.find()) {
            USER_FRACTION[0] = Integer.parseInt(matcher.group(1));
            USER_FRACTION[1] = Integer.parseInt(matcher.group(2));
        }
    }

    private static int getLeastCommonMultiply(int denominator1, int denominator2) {
        int commonDenominator = 1;
        while (commonDenominator % denominator1 != 0
                || commonDenominator % denominator2 != 0) {
            commonDenominator++;
        }
        return commonDenominator;
    }

    private static void convertDecimalToCommonFraction(double decimal) {
        int fractionalSize = BigDecimal.valueOf(decimal).scale();
        USER_FRACTION[1] = (int) Math.pow(10, fractionalSize);
        USER_FRACTION[0] = (int) Math.round((decimal - (int) decimal) * USER_FRACTION[1]) + USER_FRACTION[1];
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
