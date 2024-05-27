package creational.abstractfactory.pattern.abstractfactory;

public abstract class Shirt {

    private String typeShirt;
    private Character sizeShirt;

    public Shirt(String typeShirt, Character sizeShirt) {
        this.typeShirt = typeShirt;
        this.sizeShirt = sizeShirt;
    }

    public String getTypeShirt() {
        return typeShirt;
    }

    public void setTypeShirt(String typeShirt) {
        this.typeShirt = typeShirt;
    }

    public Character getSizeShirt() {
        return sizeShirt;
    }

    public void setSizeShirt(Character sizeShirt) {
        this.sizeShirt = sizeShirt;
    }

    public abstract void details();
}
