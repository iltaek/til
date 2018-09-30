package pattern.factory;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY Style Sauce and Pepperoni";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Salty Pepperoni");
    }
}
