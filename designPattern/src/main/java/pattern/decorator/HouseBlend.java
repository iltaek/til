package pattern.decorator;

public abstract class HouseBlend extends Beverage {

    private static final String DESCRIPTION = "Hous blended coffee";

    public HouseBlend(Size size) {
        super(DESCRIPTION, size);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + this.getSize();
    }

    @Override
    public double cost() {
        double baseCost = .89;
        return baseCost + additionalCost();
    }

    public abstract double additionalCost();
}
