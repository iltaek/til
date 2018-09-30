package pattern.factory;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Sauce and Pepperoni Pizza";
        dough = "Thick Dough";
        sauce = "Tomato Sauce";

        toppings.add("Italian Pepperoni");
        toppings.add("Homemade Salami");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 30 minutes at 430");
    }
}
