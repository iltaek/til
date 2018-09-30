package pattern.factory;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Sauce and Vegitables";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Fresh Vegitables");
    }
}
