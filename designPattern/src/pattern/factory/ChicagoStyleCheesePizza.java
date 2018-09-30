package pattern.factory;

public class ChicagoStyleCheesePizza extends Pizza {
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
}
