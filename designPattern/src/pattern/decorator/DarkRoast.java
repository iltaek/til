package pattern.decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark roast coffee";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + this.getSize();
    }

    @Override
    public double cost() {
        double cost = .99;
        if (this.getSize() == SIZES.TALL) {
            cost += 0;
        } else if (this.getSize() == SIZES.GRANDE) {
            cost += .19;
        } else if (this.getSize() == SIZES.VENTI) {
            cost += .29;
        }
        return cost;
    }
}
