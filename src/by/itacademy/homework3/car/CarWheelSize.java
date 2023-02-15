package by.itacademy.homework3.car;

public enum CarWheelSize {
    SMALL(19),
    MIDDLE(20),
    LARGE(21);
    private final int wheelDiameter;

    CarWheelSize(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }
}
