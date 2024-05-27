package creational.factorymethod.pattern.concretefactory.production;

import creational.factorymethod.pattern.abstractfactory.Clothing;

public class TShirtClothing implements Clothing {
    @Override
    public void toProduce() {
        System.out.println("Produzindo T-Shirt");
        exec();
    }

    @Override
    public void exec() {
        System.out.println("T-Shirt produzida");
    }
}
