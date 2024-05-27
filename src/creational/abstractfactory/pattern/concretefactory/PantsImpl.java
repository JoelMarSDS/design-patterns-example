package creational.abstractfactory.pattern.concretefactory;

import creational.abstractfactory.pattern.abstractfactory.Pant;

public class PantsImpl extends Pant {

    public PantsImpl(String typePant, Integer sizePant) {
        super(typePant, sizePant);
    }

    @Override
    public void details() {
        String info = """
                Pants
                    Type: %s
                    Size: %d
                """.formatted(getTypePant(), getSizePant());

        System.out.println(info);
    }
}
