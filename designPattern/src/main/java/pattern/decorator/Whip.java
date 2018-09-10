package pattern.decorator;

public class Whip extends CondimentBeverage {
    public Whip(Beverage original) {
        super(original);
    }

    @Override
    protected double additionalCost() {
        if (getSize() == Size.TALL) {
            return .05;
        }
        if (getSize() == Size.GRANDE) {
            return .10;
        }
        if (getSize() == Size.VENTI) {
            return .15;
        }
        throw new IllegalStateException();
    }

    @Override
    protected String additionalDescription() {
        return ", Whip";
    }
}
