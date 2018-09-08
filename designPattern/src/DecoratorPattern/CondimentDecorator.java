package DecoratorPattern;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();

    public abstract SIZES getSize();
}
