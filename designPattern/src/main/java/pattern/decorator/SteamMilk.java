package pattern.decorator;

public class SteamMilk extends CondimentBeverage {

    public SteamMilk(Beverage original) {
        super(original);
    }

    @Override
    protected double additionalCost() {
        if (getSize() == Size.TALL) {
            return .10;
        }
        if (getSize() == Size.GRANDE) {
            return .15;
        }
        if (getSize() == Size.VENTI) {
            return .20;
        }
        throw new IllegalStateException();
    }

    @Override
    protected String additionalDescription() {
        return ", Steam";
    }
}
