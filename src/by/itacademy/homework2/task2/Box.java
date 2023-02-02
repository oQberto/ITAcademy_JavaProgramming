package by.itacademy.homework2.task2;

public class Box {
    private int length;
    private int height;
    private int width;


    public Box(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Box(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public static String determineBoxKind(Box box) {
        if (box.length == box.width && box.length == box.height) {
            return "Cube";
        } else if (box.height > 0 && box.width > 0 && box.length > 0) {
            return "Common box";
        } else if (box.width == 0) {
            return "Envelope";
        }
        return "The box cannot exist";
    }

    @Override
    public String toString() {
        return "Box{ " +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                " }";
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
