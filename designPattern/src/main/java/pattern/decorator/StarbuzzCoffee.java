package pattern.decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new TallEspresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new Whip(new Mocha(new Soy(new GrandeHouseBlend())));
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new SteamMilk(new Soy(new VentiDarkRoast()));
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
