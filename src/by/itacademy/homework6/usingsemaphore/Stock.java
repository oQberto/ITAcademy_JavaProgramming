package by.itacademy.homework6.usingsemaphore;

import by.itacademy.homework6.robotparts.RobotPart;

import java.util.LinkedList;
import java.util.List;

public class Stock {
    List<RobotPart> robotParts = new LinkedList<>();

    public void addPartToStock(RobotPart part) {
        robotParts.add(part);
    }

    public int getStockSize() {
        return robotParts.size();
    }
}
