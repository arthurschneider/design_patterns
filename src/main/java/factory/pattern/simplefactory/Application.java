package factory.pattern.simplefactory;

import factory.pattern.model.Pizza.PizzaTyp;

public class Application {

    public static void main(String[] args) {

        SimplePizzaFactory factory = new SimplePizzaFactory();

        PizzaStore pizzaStore = new PizzaStore(factory);
        
        pizzaStore.orderPizza(PizzaTyp.PEPPERONI);
        pizzaStore.orderPizza(PizzaTyp.CHEESE);
        pizzaStore.orderPizza(PizzaTyp.VEGGIE);
        pizzaStore.orderPizza(PizzaTyp.CLAM);
    }
}
