package pattern.decorator;

public abstract class Espresso extends Beverage {

    private static final String DESCRIPTION = "Espresso";

    public Espresso(Size size) {
        super(DESCRIPTION, size);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + this.getSize();
    }

    @Override
    public double cost() {
        double baseCost = 1.99;
        return baseCost + additionalCost();
    }

    protected abstract double additionalCost();
}
