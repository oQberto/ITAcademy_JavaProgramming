import by.itacademy.homework2.task2_10.Box;

public class Main {
    public static void main(String[] args) {
        String boxObj = "Box[0,2,0]";
        Box box = new Box(boxObj);
        Box cube = new Box(3);
        Box commonBox = new Box(1, 2, 3);
        Box envelope = new Box(0, 2, 3);

        System.out.println(Box.determineBoxKind(box));
        System.out.println(Box.determineBoxKind(cube));
        System.out.println(Box.determineBoxKind(commonBox));
        System.out.println(Box.determineBoxKind(envelope));
    }
}