package by.itacademy.homework2.task10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public Box(String boxObject) {
        Pattern pattern = Pattern.compile("Box\\[(\\d),?(\\d)?,?(\\d)?]");
        Matcher matcher = pattern.matcher(boxObject);
        if (matcher.find()) {
            length = Integer.parseInt(matcher.group(1));
            height = matcher.group(2) == null
                    ? 0
                    : Integer.parseInt(matcher.group(2));
            width = matcher.group(3) == null
                    ? 0
                    : Integer.parseInt(matcher.group(3));
        } else {
            throw new IllegalArgumentException("Incorrect input");
        }
    }

    public static String determineBoxKind(Box box) {
        if (box.length != 0 && box.length == box.width && box.length == box.height) {
            return "Cube";
        } else if (box.height > 0 && box.width > 0 && box.length > 0) {
            return "Common box";
        } else if (box.width == 0 && box.height != 0) {
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
