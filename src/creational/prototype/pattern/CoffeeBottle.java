package creational.prototype.pattern;

public final class CoffeeBottle extends Bottle {

    public CoffeeBottle() {
    }

    public CoffeeBottle(CoffeeBottle target) {
        super(target);
    }

    @Override
    public Bottle copy() {
        return new CoffeeBottle(this);
    }
}
