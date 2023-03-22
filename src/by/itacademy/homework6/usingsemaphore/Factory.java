package by.itacademy.homework6.usingsemaphore;

import by.itacademy.homework6.robotparts.RobotPart;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Factory implements Runnable {
    private static final Integer PRODUCTION_SPEED = 50;
    private static final Random RANDOM = new Random();
    private final Stock stock;
    private final Semaphore semaphore;
    private boolean gameIsActive = true;

    public Factory(Semaphore semaphore, Stock stock) {
        this.semaphore = semaphore;
        this.stock = stock;
    }

    @Override
    public void run() {
        while (gameIsActive) {
            createPart();
        }
    }

    private void createPart() {
        try {
            semaphore.acquire();
            Thread.sleep(PRODUCTION_SPEED);
            stock.addPartToStock(
                    RobotPart.values()
                            [RANDOM.nextInt(RobotPart.values().length)]);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public RobotPart getPartFromStock() {
        RobotPart part = stock.robotParts.get(RANDOM.nextInt(stock.getStockSize()));
        stock.robotParts.remove(part);
        return part;
    }

    public int getStockSize() {
        return stock.getStockSize();
    }

    public void returnPartToFactory(RobotPart part) {
        stock.addPartToStock(part);
    }

    public boolean isGameActive() {
        return gameIsActive;
    }

    public void setGameIsActive(boolean gameIsActive) {
        this.gameIsActive = gameIsActive;
    }
}
