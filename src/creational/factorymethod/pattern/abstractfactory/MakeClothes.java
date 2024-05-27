package creational.factorymethod.pattern.abstractfactory;

public abstract class MakeClothes {

    public void production() {
        Clothing clothing = createClothing();
        clothing.toProduce();
    }

    public abstract Clothing createClothing();
}
