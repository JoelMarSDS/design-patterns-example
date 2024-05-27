package creational.factorymethod.pattern.concretefactory.creation;

import creational.factorymethod.pattern.abstractfactory.Clothing;
import creational.factorymethod.pattern.abstractfactory.MakeClothes;
import creational.factorymethod.pattern.concretefactory.production.TShirtClothing;

public class TShirtMakeClothes extends MakeClothes {

    @Override
    public Clothing createClothing() {
        return new TShirtClothing();
    }
}
