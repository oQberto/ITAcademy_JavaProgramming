package by.itacademy.homework2.task4;

public class Car {
    private CarModel carModel;
    private CarColor carColor;
    private final CarColor[] audiColors = {CarColor.BLUE, CarColor.RED,  CarColor.GREEN};
    private final CarColor[] bmwColors = {CarColor.ORANGE, CarColor.BLACK,  CarColor.PURPLE};
    private final CarColor[] kiaColors = {CarColor.YELLOW, CarColor.GRAY,  CarColor.WHITE};

    public Car(CarModel carModel, CarColor carColor) {
        this.carModel = carModel;
        this.carColor = carColor;
    }

    public void changeCarColor(String color) {
        switch (carModel.getCarModel()) {
            case "Audi":
                for (CarColor carColor : audiColors) {
                    if (carColor.getCarColor().equals(color)) {
                        this.carColor = carColor;
                        break;
                    }
                }
                break;
            case "BMW":
                for (CarColor carColor : bmwColors) {
                    if (carColor.getCarColor().equals(color)) {
                        this.carColor = carColor;
                        break;
                    }
                }
                break;
            case "KIA":
                for (CarColor carColor : kiaColors) {
                    if (carColor.getCarColor().equals(color)) {
                        this.carColor = carColor;
                        break;
                    }
                }
                break;
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
