package by.itacademy.homework2.task4;

public enum CarColorCatalogue {
    BLUE("Audi", "Blue"),
    RED("Audi", "Red"),
    GREEN("Audi", "Green"),

    ORANGE("BMW", "Orange"),
    BLACK("BMW", "Black"),
    PURPLE("BMW", "Purple"),

    YELLOW("KIA", "Yellow"),
    GRAY("KIA", "Gray"),
    WHITE("KIA", "White");
    private final String color;
    private final String carModel;

    CarColorCatalogue(String carModel, String color) {
        this.color = color;
        this.carModel = carModel;
    }

    public String getColor() {
        return color;
    }

    public String getCarModel() {
        return carModel;
    }
}
