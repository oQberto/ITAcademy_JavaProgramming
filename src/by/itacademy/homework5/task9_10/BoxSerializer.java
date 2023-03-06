package by.itacademy.homework5.task9_10;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class BoxSerializer {
    private static final String BOXES_PATH = "D:\\Java Projects\\ITAcademy_JavaProgramming\\src\\by\\itacademy\\homework5\\task9_10\\boxes";
    private Box[] boxes;
    private static final Random RANDOM = new Random();
    ObjectOutputStream oos;
    ObjectInputStream ois;

    public void start() throws IOException, ClassNotFoundException {
        makeBoxes(5);
        writeBox(boxes);
        readBoxes();
        sortByVolume();
        writeBox(boxes[boxes.length - 1]);
    }

    private void makeBoxes(int boxCount) {
        boxes = new Box[boxCount];
        for (int i = 0; i < boxes.length; i++) {
            boxes[i] = new Box(RANDOM.nextInt(10), RANDOM.nextInt(10), RANDOM.nextInt(10));
        }
    }

    private void sortByVolume() {
        Arrays.sort(boxes, Comparator.comparingInt(Box::getVolume));
    }

    private void readBoxes() throws IOException, ClassNotFoundException {
        ois = new ObjectInputStream(new FileInputStream(BOXES_PATH));
        boxes = (Box[]) ois.readObject();
        ois.close();
    }

    private void writeBox(Object ob) throws IOException {
        oos = new ObjectOutputStream(new FileOutputStream(BOXES_PATH));
        oos.writeObject(ob);
        oos.close();
    }
}