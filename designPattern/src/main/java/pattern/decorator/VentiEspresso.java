package pattern.decorator;

public class VentiEspresso extends Espresso {

    public VentiEspresso() {
        super(Size.VENTI);
    }

    @Override
    protected double additionalCost() {
        return .29;
    }
}
