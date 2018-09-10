package pattern.decorator;

public class TallEspresso extends Espresso {

    public TallEspresso() {
        super(Size.TALL);
    }

    @Override
    protected double additionalCost() {
        return 0;
    }
}
