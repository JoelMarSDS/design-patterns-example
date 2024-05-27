package creational.abstractfactory.pattern.abstractfactory;

public interface ClothesFactory {
    Shirt createShirt(String typeShirt, Character sizeShirt);
    Pant createPant(String typePant, Integer sizePant);
}
