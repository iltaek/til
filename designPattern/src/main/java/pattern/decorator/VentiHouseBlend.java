package pattern.decorator;

public class VentiHouseBlend extends HouseBlend {

    public VentiHouseBlend() {
        super(Size.VENTI);
    }

    @Override
    public double additionalCost() {
        return .29;
    }
}
