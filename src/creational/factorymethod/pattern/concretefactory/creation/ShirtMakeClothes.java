package creational.factorymethod.pattern.concretefactory.creation;

import creational.factorymethod.pattern.abstractfactory.Clothing;
import creational.factorymethod.pattern.abstractfactory.MakeClothes;
import creational.factorymethod.pattern.concretefactory.production.ShirtClothing;

public class ShirtMakeClothes extends MakeClothes {

    @Override
    public Clothing createClothing() {
        return new ShirtClothing();
    }
}
