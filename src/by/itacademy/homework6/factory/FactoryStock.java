package by.itacademy.homework6.factory;

import by.itacademy.homework6.robotparts.RobotPart;

import java.util.LinkedList;
import java.util.List;

public class FactoryStock {
    List<RobotPart> robotParts = new LinkedList<>();

    public synchronized  void addPartToStock(RobotPart part) {
        robotParts.add(part);
    }

    public synchronized List<RobotPart> getRobotParts() {
        return robotParts;
    }
}
