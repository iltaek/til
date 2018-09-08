package DecoratorPattern;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    @Override
    public SIZES getSize() {
        return beverage.getSize();
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == SIZES.TALL) {
            cost += .05;
        } else if (getSize() == SIZES.GRANDE) {
            cost += .10;
        } else if (getSize() == SIZES.VENTI) {
            cost += .15;
        }
        return cost;
    }
}
