package pattern.decorator;

public class GrandeEspresso extends Espresso {

    public GrandeEspresso() {
        super(Size.GRANDE);
    }

    @Override
    protected double additionalCost() {
        return .19;
    }
}
