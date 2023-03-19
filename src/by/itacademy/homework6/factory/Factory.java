package by.itacademy.homework6.factory;

import by.itacademy.homework6.robotparts.RobotPart;

import java.util.Random;

public class Factory implements Runnable {
    private static final Random RANDOM = new Random();
    private static final Integer PRODUCTION_SPEED = 50;
    private final FactoryStock factoryStock;
    private boolean gameIsActive = true;

    public Factory(FactoryStock factoryStock) {
        this.factoryStock = factoryStock;
    }

    @Override
    public void run() {
        while (gameIsActive) {
            createPart();
        }
    }

    private void createPart() {
        try {
            synchronized (factoryStock) {
                Thread.sleep(PRODUCTION_SPEED);
                factoryStock.addPart(
                        RobotPart.values()
                                [RANDOM.nextInt(RobotPart.values().length)]);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized RobotPart getPartFromStock() {
        RobotPart part = factoryStock.getRobotParts().get(RANDOM.nextInt(factoryStock.getRobotParts().size()));
        factoryStock.getRobotParts().remove(part);
        return part;
    }

    public void returnPartToFactory(RobotPart part) {
        factoryStock.addPart(part);
    }

    public boolean isGameActive() {
        return gameIsActive;
    }

    public void setGameIsActive(boolean gameIsActive) {
        this.gameIsActive = gameIsActive;
    }
}
