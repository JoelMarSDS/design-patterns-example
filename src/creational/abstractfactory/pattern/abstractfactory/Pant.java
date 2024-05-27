package creational.abstractfactory.pattern.abstractfactory;

public abstract class Pant {

    private String typePant;
    private Integer sizePant;

    public Pant(String typePant, Integer sizePant) {
        this.typePant = typePant;
        this.sizePant = sizePant;
    }

    public String getTypePant() {
        return typePant;
    }

    public void setTypePant(String typePant) {
        this.typePant = typePant;
    }

    public Integer getSizePant() {
        return sizePant;
    }

    public void setSizePant(Integer sizePant) {
        this.sizePant = sizePant;
    }

    public abstract void details();
}
