import by.itacademy.additionalTasks.fraction.Fraction;
import by.itacademy.additionalTasks.inheritance.flowers.Flower;
import by.itacademy.additionalTasks.inheritance.flowers.FlowerColor;
import by.itacademy.additionalTasks.inheritance.flowers.FlowerType;
import by.itacademy.additionalTasks.inheritance.flowers.bouquet.Bouquet;

public class Main {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlowerToBouquet(new Flower(5, 6, FlowerType.ROSE, FlowerColor.RED));
        bouquet.addFlowerToBouquet(new Flower(3, 2, FlowerType.LILY, FlowerColor.ORANGE));
        bouquet.addFlowerToBouquet(new Flower(6, 5, FlowerType.CHAMOMILE, FlowerColor.WHITE));
        bouquet.addFlowerToBouquet(new Flower(7, 7, FlowerType.TULIP, FlowerColor.BLUE));
        bouquet.addFlowerToBouquet(new Flower(1, 1, FlowerType.CARNATION, FlowerColor.WHITE));
        bouquet.addFlowerToBouquet(new Flower(3, 4, FlowerType.LILY, FlowerColor.ORANGE));

        System.out.println(bouquet.bouquetCost());
        System.out.println(bouquet.getFlowerColorsFromBouquet());
        System.out.println(bouquet.bouquetLifeTime());
    }
}