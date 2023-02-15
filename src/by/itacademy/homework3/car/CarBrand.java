package by.itacademy.homework3.car;

public enum CarBrand {
    AUDI("Audi", 2008),
    KIA("KIA", 2009),
    VOLVO("Volvo", 2010);
    private final String brandName;
    private final int issueYear; // TODO посмотреть как лучше задать переменную года

    CarBrand(String brandName, int issueYear) {
        this.brandName = brandName;
        this.issueYear = issueYear;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getIssueYear() {
        return issueYear;
    }
}
