package pattern.decorator;

public class Soy extends CondimentBeverage {

    public Soy(Beverage original) {
        super(original);
    }

    @Override
    protected double additionalCost() {
        if (getSize() == Size.TALL) {
            return .10;
        }
        if (getSize() == Size.GRANDE) {
            return .20;
        }
        if (getSize() == Size.VENTI) {
            return .30;
        }
        throw new IllegalStateException();
    }

    @Override
    protected String additionalDescription() {
        return ", Soy";
    }
}
