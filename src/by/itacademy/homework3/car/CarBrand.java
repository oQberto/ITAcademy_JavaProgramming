package by.itacademy.homework3.car;

public enum CarBrand {
    AUDI("Audi"),
    KIA("KIA"),
    VOLVO("Volvo");
    private final String brandName;

    CarBrand(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
}
