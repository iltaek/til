package pattern.decorator;

public class TallDarkRoast extends DarkRoast {

    public TallDarkRoast() {
        super(Size.TALL);
    }

    @Override
    protected double additionalCost() {
        return 0;
    }
}
