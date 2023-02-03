import by.itacademy.homework2.task2_10.Box;

public class Main {
    public static void main(String[] args) {
        Box boxes;
        try {
            boxes = new Box("Box[1,0]");
            System.out.println(Box.determineBoxKind(boxes));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}