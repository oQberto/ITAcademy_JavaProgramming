package by.itacademy.homework5.task7;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InvertedFile {
    private static final File INPUT_PATH = new File("D:\\Java Projects\\ITAcademy_JavaProgramming\\src\\by\\itacademy\\homework5\\task7\\INPUT");
    private static final File OUTPUT_PATH = new File("D:\\Java Projects\\ITAcademy_JavaProgramming\\src\\by\\itacademy\\homework5\\task7\\OUTPUT");
    private final List<String> stringList = new ArrayList<>();

    public void invertFile() throws IOException {
        readFileToList(stringList);
        reverseList(stringList);
        writeFileFromList(stringList);
    }

    private void readFileToList(List<String> stringList) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(INPUT_PATH));
        String line = br.readLine();
        while (line != null) {
            stringList.add(line);
            line = br.readLine();
        }
        br.close();
    }

    private void writeFileFromList(List<String> stringList) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_PATH));
        for(String str : stringList) {
            bw.write(str + "\n");
        }
        bw.close();
    }

    private void reverseList(List<String> stringList) {
        Collections.reverse(stringList);
    }
}