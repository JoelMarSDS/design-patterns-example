package creational.prototype.pattern;

import java.util.Objects;

public abstract sealed class Bottle permits CoffeeBottle, WaterBottle {
    private float liter;
    private String color;

    protected Bottle() {
    }

    protected Bottle(Bottle target) {
        if (target != null) {
            this.liter = target.liter;
            this.color = target.color;
        }
    }

    public void setLiter(float liter) {
        this.liter = liter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract Bottle copy();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bottle bottle = (Bottle) o;
        return Float.compare(liter, bottle.liter) == 0 && Objects.equals(color, bottle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liter, color);
    }
}