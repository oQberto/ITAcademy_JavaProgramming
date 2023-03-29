package by.itacademy.homework4.utils.AppUI;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppUIUtils {

    private AppUIUtils(){}

    public static Object chooseConfig(Object[] objects) {
        Object object;
        flag: while(true) {
            String userBrand = userInput();
            for (Object ob : objects) {
                if (userBrand.equalsIgnoreCase(ob.toString())) {
                    object = ob;
                    break flag;
                }
            }
            System.err.println("Invalid input!");
        }
        return object;
    }

    public static int chooseLoadCapacity() {
        int loadCapacity;
        while (true) {
            int userLoadCapacity = Integer.parseInt(userInput());
            if (userLoadCapacity > 0 && userLoadCapacity < 100) {
                loadCapacity = userLoadCapacity;
                break;
            }
            System.err.println("Invalid input!");
        }
        return loadCapacity;
    }

    public static String userInput() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
