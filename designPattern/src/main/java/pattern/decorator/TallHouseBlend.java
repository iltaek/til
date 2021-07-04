package pattern.decorator;

public class TallHouseBlend extends HouseBlend {

    public TallHouseBlend() {
        super(Size.TALL);
    }

    @Override
    public double additionalCost() {
        return 0;
    }
}
