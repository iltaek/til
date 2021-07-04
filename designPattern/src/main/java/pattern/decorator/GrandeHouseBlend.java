package pattern.decorator;

public class GrandeHouseBlend extends HouseBlend {

    public GrandeHouseBlend() {
        super(Size.GRANDE);
    }

    @Override
    public double additionalCost() {
        return .19;
    }
}
