package DecoratorPattern;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    @Override
    public SIZES getSize() {
        return beverage.getSize();
    }

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == SIZES.TALL) {
            cost += .10;
        } else if (getSize() == SIZES.GRANDE) {
            cost += .20;
        } else if (getSize() == SIZES.VENTI) {
            cost += .30;
        }
        return cost;
    }
}
