package pattern.decorator;

public abstract class Beverage {

    private final String description;
    private final Size size;

    public Beverage(String description, Size size) {
        this.description = description;
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public enum Size {
        TALL,
        GRANDE,
        VENTI
    }
}
