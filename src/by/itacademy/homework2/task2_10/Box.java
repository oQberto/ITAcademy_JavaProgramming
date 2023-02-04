package by.itacademy.homework2.task2_10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Box {
    private int length;
    private int height;
    private int width;
    private final BoxKind boxKind;

    public Box(int length, int height, int width) {
        if (length > 0 && length == height && height == width) {
            this.length = length;
            this.height = height;
            this.width = width;
            boxKind = BoxKind.CUBE;
        } else if (length > 0 && height > 0 && width > 0) {
            this.length = length;
            this.height = height;
            this.width = width;
            boxKind = BoxKind.COMMON_BOX;
        } else {
            throw new IllegalArgumentException("Invalid arguments");
        }
    }

    public Box(int length, int height) {
        if (length > 0 && height > 0) {
            this.length = length;
            this.height = height;
            boxKind = BoxKind.ENVELOPE;
        } else {
            throw new IllegalArgumentException("Invalid arguments");
        }
    }

    public Box(int length) {
        if (length > 0) {
            this.length = length;
            this.height = length;
            this.width = length;
            boxKind = BoxKind.CUBE;
        } else {
            throw new IllegalArgumentException("Invalid arguments");
        }
    }

    public Box(String boxObject) {
        Pattern pattern = Pattern.compile("Box\\[([1-9]+),?([1-9]+)?,?([1-9]+)?]");
        Matcher matcher = pattern.matcher(boxObject);
        if (matcher.find()) {
            if (matcher.group(3) == null) {
                length = Integer.parseInt(matcher.group(1));
                height = Integer.parseInt(matcher.group(2));
                boxKind = BoxKind.ENVELOPE;
            } else if (matcher.group(2) == null && matcher.group(3) == null) {
                length = Integer.parseInt(matcher.group(1));
                boxKind = BoxKind.CUBE;
            } else {
                length = Integer.parseInt(matcher.group(1));
                height = Integer.parseInt(matcher.group(2));
                width = Integer.parseInt(matcher.group(3));
                if (length > 0 && length == height && height == width) {
                    boxKind = BoxKind.CUBE;
                } else {
                    boxKind = BoxKind.COMMON_BOX;
                }
            }
        } else {
            throw new IllegalArgumentException("Incorrect input");
        }
    }

    public static String determineBoxKind(Box box) {
        String result = "";
        switch (box.boxKind.getBoxKind()) {
            case "Common box" -> result = BoxKind.COMMON_BOX.getBoxKind();
            case "Cube" -> result = BoxKind.CUBE.getBoxKind();
            case "Envelope" -> result = BoxKind.ENVELOPE.getBoxKind();
        }
        return result;
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

    public BoxKind getBoxKind() {
        return boxKind;
    }
}
