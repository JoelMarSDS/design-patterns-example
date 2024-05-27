package creational.factorymethod;

import creational.factorymethod.pattern.abstractfactory.Clothing;
import creational.factorymethod.pattern.concretefactory.production.ShirtClothing;
import creational.factorymethod.pattern.concretefactory.production.TShirtClothing;

/*
 * Design tem que ter
 * 1. Produto Abstrato
 * 2. Produto Concreto de especialização
 * 3. Metodo responsavel pela fabricação do produto
 * */

public class FactoryMethodMain {
    public static void main(String[] args) {

        Clothing clothing = new ShirtClothing();

        clothing.toProduce();

        clothing = new TShirtClothing();

        clothing.toProduce();

    }
}
