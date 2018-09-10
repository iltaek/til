package pattern.decorator;

public class GrandeDarkRoast extends DarkRoast {

    public GrandeDarkRoast() {
        super(Size.GRANDE);
    }

    @Override
    protected double additionalCost() {
        return .19;
    }
}
