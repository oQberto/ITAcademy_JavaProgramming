package by.itacademy.workbook.classesandobjects.atm;

public class ATM {
    private int countOfBanknotes20;
    private int countOfBanknotes50;
    private int countOfBanknotes100;
    private int totalAmountOfMoney;


    public ATM(int countOfBanknotes20, int countOfBanknotes50, int countOfBanknotes100) {
        this.countOfBanknotes20 = countOfBanknotes20;
        this.countOfBanknotes50 = countOfBanknotes50;
        this.countOfBanknotes100 = countOfBanknotes100;

        totalAmountOfMoney = countOfBanknotes20 * 20
                + countOfBanknotes50 * 50
                + countOfBanknotes100 * 100;
    }

    public int addMoney(int kindOfBanknote, int countOfBanknotes) {
        totalAmountOfMoney += switch (kindOfBanknote) {
            case 20, 50, 100 -> kindOfBanknote * countOfBanknotes;
            default -> throw new IllegalStateException("Unexpected value: " + kindOfBanknote);
        };
        return totalAmountOfMoney;
    }

    @Override
    public String toString() {
        return "ATM{ " +
                "countOfBanknotes20=" + countOfBanknotes20 +
                ", countOfBanknotes50=" + countOfBanknotes50 +
                ", countOfBanknotes100=" + countOfBanknotes100 +
                ", totalAmountOfMoney=" + totalAmountOfMoney +
                 " }";
    }

    public int getCountOfBanknotes20() {
        return countOfBanknotes20;
    }

    public void setCountOfBanknotes20(int countOfBanknotes20) {
        this.countOfBanknotes20 = countOfBanknotes20;
    }

    public int getCountOfBanknotes50() {
        return countOfBanknotes50;
    }

    public void setCountOfBanknotes50(int countOfBanknotes50) {
        this.countOfBanknotes50 = countOfBanknotes50;
    }

    public int getCountOfBanknotes100() {
        return countOfBanknotes100;
    }

    public void setCountOfBanknotes100(int countOfBanknotes100) {
        this.countOfBanknotes100 = countOfBanknotes100;
    }

    public int getTotalAmountOfMoney() {
        return totalAmountOfMoney;
    }

    public void setTotalAmountOfMoney(int totalAmountOfMoney) {
        this.totalAmountOfMoney = totalAmountOfMoney;
    }
}
