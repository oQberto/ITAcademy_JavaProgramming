package by.itacademy.homework5.task9_10;

import java.io.Serializable;

public class Box implements Serializable {
    private int x;
    private int y;
    private int z;
    private final int volume;

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.volume = x * y * z;
    }

    @Override
    public String toString() {
        return "Box{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", volume=" + volume +
                '}';
    }

    public int getVolume() {
        return volume;
    }
}
