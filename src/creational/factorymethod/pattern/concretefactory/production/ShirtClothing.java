package creational.factorymethod.pattern.concretefactory.production;

import creational.factorymethod.pattern.abstractfactory.Clothing;

public class ShirtClothing implements Clothing {
    @Override
    public void toProduce() {
        System.out.println("Produzindo Roupa");
        exec();
    }

    @Override
    public void exec() {
        System.out.println("Roupa finalizada");
    }
}
