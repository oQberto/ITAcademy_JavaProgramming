package by.itacademy.homework5.task8;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Reader {
    private static final String INPUT_1_PATH = "D:\\Java Projects\\ITAcademy_JavaProgramming\\src\\by\\itacademy\\homework5\\task8\\INPUT_1";
    private static final String INPUT_2_PATH = "D:\\Java Projects\\ITAcademy_JavaProgramming\\src\\by\\itacademy\\homework5\\task8\\INPUT_2";
    private static final String OUTPUT_PATH = "D:\\Java Projects\\ITAcademy_JavaProgramming\\src\\by\\itacademy\\homework5\\task8\\OUTPUT";
    private BufferedReader bf;
    private final Map<String, Integer> map = new HashMap<>();

    public void getEqualsLines() throws IOException {
        fillMap();
        compareFiles();
        writeEqualsLinesToFile();
    }

    private void fillMap() throws IOException {
        bf = new BufferedReader(new FileReader(INPUT_1_PATH));
        String line = bf.readLine();

        while (line != null) {
            if (!line.equals("")) {
                map.put(line, 0);
            }
            line = bf.readLine();
        }
        bf.close();
    }

    private void compareFiles() throws IOException {
        bf = new BufferedReader(new FileReader(INPUT_2_PATH));
        String line = bf.readLine();
        while (line != null) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getKey().equals(line)) {
                    entry.setValue(entry.getValue() + 1);
                }
            }
            line = bf.readLine();
        }
        bf.close();
    }

    private void writeEqualsLinesToFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_PATH));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                bw.write(entry.getKey() + "\n");
            }
        }
        bw.close();
    }
}
