package creational.abstractfactory.pattern.concretefactory;

import creational.abstractfactory.pattern.abstractfactory.ClothesFactory;
import creational.abstractfactory.pattern.abstractfactory.Pant;
import creational.abstractfactory.pattern.abstractfactory.Shirt;

public class ClothingFactoryImpl implements ClothesFactory {

    @Override
    public Shirt createShirt(String typeShirt, Character sizeShirt) {
        return new ShirtImpl(typeShirt, sizeShirt);
    }

    @Override
    public Pant createPant(String typePant, Integer sizePant) {
        return new PantsImpl(typePant, sizePant);
    }
}
