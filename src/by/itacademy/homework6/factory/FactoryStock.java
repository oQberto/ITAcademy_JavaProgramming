package by.itacademy.homework6.factory;

import by.itacademy.homework6.robotparts.RobotPart;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FactoryStock {
    private final List<RobotPart> robotParts = new LinkedList<>();
    private static final Random RANDOM = new Random();

    public synchronized RobotPart getPart() {
        RobotPart part = robotParts.get(RANDOM.nextInt(robotParts.size()));
        robotParts.remove(part);
        return part;
    }

    public synchronized  void addPart(RobotPart part) {
        robotParts.add(part);
    }

    public List<RobotPart> getRobotParts() {
        return robotParts;
    }
}
