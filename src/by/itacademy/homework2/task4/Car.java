package by.itacademy.homework2.task4;

public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void changeCarColor(String color) {
        for (CarColorCatalogue carColor : CarColorCatalogue.values()) {
            if (carColor.getCarModel().equals(this.model)
                    && carColor.getColor().equals(color)) {
                this.color = color;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Car{ " +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                " }";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
