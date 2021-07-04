package pattern.decorator;

public class VentiDarkRoast extends DarkRoast {

    public VentiDarkRoast() {
        super(Size.VENTI);
    }

    @Override
    protected double additionalCost() {
        return .29;
    }
}
