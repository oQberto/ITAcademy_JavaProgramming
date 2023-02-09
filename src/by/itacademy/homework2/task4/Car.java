package by.itacademy.homework2.task4;

public class Car {
    private CarModel carModel;
    private CarColor carColor;

    public Car(CarModel carModel, CarColor carColor) {
        this.carModel = carModel;
        this.carColor = carColor;
    }

    public void changeCarColor(String color) {
        switch (carModel.getCarModel()) {
            case "Audi" -> selectColor(CarColor.getAudiColors(), color);
            case "BMW" -> selectColor(CarColor.getBmwColors(), color);
            case "KIA" -> selectColor(CarColor.getKiaColors(), color);
        }
    }

    private void selectColor(CarColor[] carColors, String color) {
        for (CarColor carColor : carColors) {
            if (carColor.getCarColor().equals(color)) {
                this.carColor = carColor;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Car{ " +
                "carModel=" + carModel.getCarModel() +
                ", carColor=" + carColor.getCarColor() +
                " }";
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }
}
