package factory.pattern.simplefactory;

import factory.pattern.model.CheesePizza;
import factory.pattern.model.ClamPizza;
import factory.pattern.model.PepperoniPizza;
import factory.pattern.model.Pizza;
import factory.pattern.model.Pizza.PizzaTyp;
import factory.pattern.model.VeggiePizza;

public class SimplePizzaFactory {

    public SimplePizzaFactory() {
        System.out.println("Creating Pizza Factrory");
    }

    public Pizza createPizza(PizzaTyp type) {
        switch (type) {
        case CHEESE:
            return new CheesePizza();
        case CLAM:
            return new ClamPizza();
        case PEPPERONI:
            return new PepperoniPizza();
        case VEGGIE:
            return new VeggiePizza();
        }
        return null;
    }
}
