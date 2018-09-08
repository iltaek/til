package DecoratorPattern;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    @Override
    public SIZES getSize() {
        return beverage.getSize();
    }

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == SIZES.TALL) {
            cost += .10;
        } else if (getSize() == SIZES.GRANDE) {
            cost += .15;
        } else if (getSize() == SIZES.VENTI) {
            cost += .20;
        }
        return cost;
    }
}
