package creational.prototype.pattern;

import java.util.Objects;

public final class WaterBottle extends Bottle {
    private boolean isThermal;

    public WaterBottle() {
    }

    public WaterBottle(WaterBottle target) {
        super(target);
        if (target != null) {
            this.isThermal = target.isThermal;
        }
    }

    public void setThermal(boolean thermal) {
        this.isThermal = thermal;
    }

    @Override
    public Bottle copy() {
        return new WaterBottle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WaterBottle rectangle = (WaterBottle) o;
        return isThermal == rectangle.isThermal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isThermal);
    }
}
