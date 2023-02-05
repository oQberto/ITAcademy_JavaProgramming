import by.itacademy.homework2.task2_10.Box;

public class Main {
    public static void main(String[] args) {
        Box commonBox = new Box("Box[1,12,45]");
        Box envelope = new Box(78, 5);
        Box cube = new Box(29);

        System.out.println(commonBox.getBoxKind().getBoxKind());
        System.out.println(envelope.getBoxKind().getBoxKind());
        System.out.println(cube.getBoxKind().getBoxKind() + "\n");

        System.out.println(Box.determineBoxKind(commonBox));
        System.out.println(Box.determineBoxKind(envelope));
        System.out.println(cube.getBoxKind().getBoxKind());
    }
}