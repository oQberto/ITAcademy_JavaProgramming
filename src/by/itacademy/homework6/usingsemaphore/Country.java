package by.itacademy.homework6.usingsemaphore;

import by.itacademy.homework6.robotparts.RobotPart;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Country implements Runnable {
    private static final List<RobotPart> ROBOT = new LinkedList<>();
    private static final Integer WINNING_ARMY_SIZE = 20;
    private final Semaphore semaphore;
    private final Factory factory;
    private final String countryName;
    private boolean isWinner = false;
    private int armyCount = 0;

    public Country(Semaphore semaphore, Factory factory, String countryName) {
        this.semaphore = semaphore;
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
        try {
                semaphore.acquire();
                if (factory.getStockSize() > 0) {
                    RobotPart partFromStock = factory.getPartFromStock();

                    if (partNotExist(partFromStock)) {
                        ROBOT.add(partFromStock);
                    } else {
                        factory.returnPartToFactory(partFromStock);
                    }
                    ifRobotCreate();
                    checkWinner();
                }
                semaphore.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void ifRobotCreate() {
        if (ROBOT.size() == RobotPart.values().length) {
            armyCount++;
            createdMessage();
            ROBOT.clear();
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
