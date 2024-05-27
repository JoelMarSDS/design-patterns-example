package creational.abstractfactory;

import creational.abstractfactory.pattern.abstractfactory.ClothesFactory;
import creational.abstractfactory.pattern.concretefactory.ClothingFactoryImpl;
import creational.abstractfactory.pattern.abstractfactory.Pant;
import creational.abstractfactory.pattern.abstractfactory.Shirt;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        ClothesFactory clothesFactory = new ClothingFactoryImpl();

        Shirt shirt = clothesFactory.createShirt("Polo", 'M');
        Pant pant = clothesFactory.createPant("Social", 42);

        shirt.details();
        pant.details();
    }
}
