package by.itacademy.additionalTasks.phone;

public enum PhoneModel {
    SAMSUNG("Samsung"),
    NOKIA("Nokia"),
    IPHONE("Iphone");
    private final String phoneName;

    PhoneModel(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneName() {
        return phoneName;
    }
}
