package by.itacademy.homework6.countries;

import by.itacademy.homework6.factory.Factory;
import by.itacademy.homework6.factory.FactoryStock;
import by.itacademy.homework6.robotparts.RobotPart;

import java.util.ArrayList;
import java.util.List;

public class Country implements Runnable {
    private static final List<RobotPart> ROBOT = new ArrayList<>();
    private static final Integer WINNING_ARMY_SIZE = 20;
    private final FactoryStock factoryStock;
    private final Factory factory;
    private final String countryName;
    private boolean isWinner = false;
    private int armyCount = 0;

    public Country(FactoryStock factoryStock, Factory factory, String countryName) {
        this.factoryStock = factoryStock;
        this.factory = factory;
        this.countryName = countryName;
    }

    @Override
    public void run() {
        createRobot();
    }

    private void createRobot() {
        try {
            while (!isWinner) {
                if (!factory.isGameActive()) {
                    break;
                }
                synchronized (factoryStock) {
                    while (factoryStock.getRobotParts().size() == 0) {
                        factoryStock.wait();
                    }

                    RobotPart partFromStock = factoryStock.getPart();

                    if (partNotExist(partFromStock)) {
                        ROBOT.add(partFromStock);
                    } else {
                        factoryStock.addPart(partFromStock);
                    }

                    if (ROBOT.size() == RobotPart.values().length) {
                        armyCount++;
                        createdMessage();
                        ROBOT.clear();
                    }
                    checkWinner();
                    factoryStock.notify();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
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
