package by.itacademy.workbook.classesandobjects.atm;

public class ATM {
    private int countOfBanknotes20;
    private int countOfBanknotes50;
    private int countOfBanknotes100;


    public ATM(int countOfBanknotes20, int countOfBanknotes50, int countOfBanknotes100) {
        this.countOfBanknotes20 = countOfBanknotes20;
        this.countOfBanknotes50 = countOfBanknotes50;
        this.countOfBanknotes100 = countOfBanknotes100;
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

}
