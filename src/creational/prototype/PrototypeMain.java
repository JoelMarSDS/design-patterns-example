package creational.prototype;

import creational.prototype.pattern.CoffeeBottle;
import creational.prototype.pattern.WaterBottle;
import creational.prototype.pattern.Bottle;

import java.util.ArrayList;
import java.util.List;

public class PrototypeMain {
    public static void main(String[] args) {
        List<Bottle> bottles = new ArrayList<>();
        List<Bottle> bottlesCopy = new ArrayList<>();

        CoffeeBottle coffeeBottle = new CoffeeBottle();
        coffeeBottle.setLiter(10);
        coffeeBottle.setColor("Red");
        bottles.add(coffeeBottle);

        CoffeeBottle coffeeBottleCopy = (CoffeeBottle) coffeeBottle.copy();
        bottles.add(coffeeBottleCopy);

        WaterBottle waterBottle = new WaterBottle();
        waterBottle.setThermal(true);
        waterBottle.setColor("Blue");
        bottles.add(waterBottle);

        WaterBottle waterBottle1 = new WaterBottle();
        waterBottle1.setThermal(false);
        waterBottle1.setColor("Black");
        bottles.add(waterBottle1);

        cloneAndCompare(bottles, bottlesCopy);
    }

    private static void cloneAndCompare(List<Bottle> bottles, List<Bottle> bottlesCopy) {

        for (Bottle bottleSingle : bottles) {
            bottlesCopy.add(bottleSingle.copy());
        }

        for (int i = 0; i < bottles.size(); i++) {
            if (bottles.get(i) != bottlesCopy.get(i)) {
                System.out.println(i + ": The objects Bottle are different (yay!)");
                System.out.println("...");
                if (bottles.get(i).equals(bottlesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                    System.out.println("...");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                    System.out.println("...");
                }
            } else {
                System.out.println(i + ": The objects Bottle are the same (booo!)");
            }
        }
    }
}
