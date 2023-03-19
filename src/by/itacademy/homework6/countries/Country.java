package by.itacademy.homework6.countries;

import by.itacademy.homework6.factory.Factory;
import by.itacademy.homework6.robotparts.RobotPart;

import java.util.ArrayList;
import java.util.List;

public class Country implements Runnable {
    private static final List<RobotPart> ROBOT = new ArrayList<>();
    private static final Integer WINNING_ARMY_SIZE = 20;
    private final Factory factory;
    private final String countryName;
    private boolean isWinner = false;
    private int armyCount = 0;

    public Country(Factory factory, String countryName) {
        this.factory = factory;
        this.countryName = countryName;
    }

    @Override
    public void run() {
        while (!isWinner) {
            if (!factory.isGameActive()) {
                break;
            }
            createRobot();
        }
    }

    private void createRobot() {
        synchronized (factory) {
            RobotPart partFromStock = factory.getPartFromStock();

            if (partNotExist(partFromStock)) {
                ROBOT.add(partFromStock);
            } else {
                factory.returnPartToFactory(partFromStock);
            }

            if (ROBOT.size() == RobotPart.values().length) {
                armyCount++;
                createdMessage();
                ROBOT.clear();
            }
            checkWinner();
        }
    }

    private boolean partNotExist(RobotPart robotPart) {
        for (RobotPart part : ROBOT) {
            if (robotPart.equals(part)) {
                return false;
            }
        }
        return true;
    }

    private void checkWinner() {
        if (armyCount == WINNING_ARMY_SIZE) {
            factory.setGameIsActive(false);
            isWinner = true;
            System.out.println(countryName + " won!"
            );
        }
    }

    private void createdMessage() {
        System.out.println(countryName +
                " created a robot, army count -> "
                + armyCount
        );
    }
}
