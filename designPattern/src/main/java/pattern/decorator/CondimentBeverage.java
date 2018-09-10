package pattern.decorator;

public abstract class CondimentBeverage extends Beverage {

    private final Beverage original;

    public CondimentBeverage(Beverage original) {
        super(original.getDescription(), original.getSize());
        this.original = original;
    }

    @Override
    public String getDescription() {
        return original.getDescription() + additionalDescription();
    }

    @Override
    public double cost() {
        return original.cost() + additionalCost();
    }

    protected abstract double additionalCost();

    protected abstract String additionalDescription();
}
