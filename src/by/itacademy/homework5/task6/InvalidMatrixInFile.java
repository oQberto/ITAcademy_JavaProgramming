package by.itacademy.homework5.task6;

import java.io.File;

public class InvalidMatrixInFile extends Exception {
    public InvalidMatrixInFile(String errorMessage, File file) {
        message(errorMessage, file.getPath());
    }

    private void message(String errorMessage, String file) {
        System.err.println(errorMessage + file);
    }
}
