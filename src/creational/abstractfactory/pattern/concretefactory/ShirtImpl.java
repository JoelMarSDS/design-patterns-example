package creational.abstractfactory.pattern.concretefactory;

import creational.abstractfactory.pattern.abstractfactory.Shirt;

public class ShirtImpl extends Shirt {

    public ShirtImpl(String typeShirt, Character sizeShirt) {
        super(typeShirt, sizeShirt);
    }

    @Override
    public void details() {
        String info = """
                Shirt
                    Type: %s
                    Size: %s
                """.formatted(getTypeShirt(), getSizeShirt());

        System.out.println(info);
    }
}
