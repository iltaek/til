package pattern.decorator;

public abstract class Beverage {
    String description = "no name";
    public enum SIZES {TALL, GRANDE, VENTI};
    SIZES size = SIZES.TALL;

    public void setSize(SIZES size) {
        this.size = size;
    }

    public SIZES getSize() {
        return this.size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
