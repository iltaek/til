package pattern.factory;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Sauce and Clam";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Fresh Clam");
    }
}
