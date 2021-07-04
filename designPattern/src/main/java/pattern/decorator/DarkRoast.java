package pattern.decorator;

public abstract class DarkRoast extends Beverage {

    private static final String DESCRIPTION = "Dark roast coffee";

    public DarkRoast(Size size) {
        super(DESCRIPTION, size);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + this.getSize();
    }

    @Override
    public double cost() {
        double baseCost = .99;
        return baseCost + additionalCost();
    }

    protected abstract double additionalCost();
}
