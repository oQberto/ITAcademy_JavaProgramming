package by.itacademy.homework5.task9_10;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class BoxSerializer {
    private static final String BOXES_PATH = "D:\\Java Projects\\ITAcademy_JavaProgramming\\src\\by\\itacademy\\homework5\\task9_10\\boxes";
    private static final String OUTPUT_PATH = "D:\\Java Projects\\ITAcademy_JavaProgramming\\src\\by\\itacademy\\homework5\\task9_10\\OUTPUT";
    private static final Random RANDOM = new Random();
    private Box[] boxes;

    public void start() throws IOException, ClassNotFoundException {
        makeBoxes(5);
        writeBox(boxes);
        readBoxes();
        writeBiggestVolume();
    }

    private void makeBoxes(int boxCount) {
        boxes = new Box[boxCount];
        for (int i = 0; i < boxes.length; i++) {
            boxes[i] = new Box(RANDOM.nextInt(10),
                                RANDOM.nextInt(10),
                                RANDOM.nextInt(10));
        }
    }

    private void writeBiggestVolume() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_PATH));
        bw.write(
                "Biggest volume is: " + Arrays.stream(boxes)
                .mapToInt(Box::getVolume)
                .max()
                .orElse(0)
        );
        bw.close();
    }

    private void readBoxes() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(BOXES_PATH));
        boxes = (Box[]) ois.readObject();
        ois.close();
    }

    private void writeBox(Object ob) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(BOXES_PATH));
        oos.writeObject(ob);
        oos.close();
    }
}