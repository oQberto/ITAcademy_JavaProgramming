package by.itacademy.homework2.task1;

public enum Month {
    JANUARY(1, "January", "Jan"),
    FEBRUARY(2, "February", "Feb"),
    MARCH(3, "March", "March"),
    APRIL(4, "April", "April"),
    MAY(5, "May", "May"),
    JUNE(6, "June", "June"),
    JULY(7, "July", "July"),
    AUGUST(8, "August", "Aug"),
    SEPTEMBER(9, "September", "Sept"),
    OCTOBER(10, "October", "Oct"),
    NOVEMBER(11, "November", "Nov"),
    DECEMBER(12, "December", "Dec");
    private final int monthNumber;
    private final String monthName;
    private final String abbreviation;

    Month(int monthNumber, String monthName, String abbreviation) {
        this.monthNumber = monthNumber;
        this.monthName = monthName;
        this.abbreviation = abbreviation;
    }

    public static int getMonthNumberByName(String name) {
        for (Month month : Month.values()) {
            if (month.getMonthName().equals(name)
                || month.getAbbreviation().equals(name)) {
                return month.getMonthNumber();
            }
        }
        return -1;
    }

    public static String getMonthNameByNumber(int monthNumber) {
        for (Month month : Month.values()) {
            if (month.getMonthNumber() == monthNumber) {
                return month.getMonthName();
            }
        }
        return "Month doesn't exist.";
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        return monthName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
