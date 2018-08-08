package factory.pattern.simplefactory;

import factory.pattern.model.Pizza;
import factory.pattern.model.Pizza.PizzaTyp;

public class PizzaStore {

    SimplePizzaFactory factory;
    
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    
    public Pizza orderPizza(PizzaTyp type) {
        Pizza pizza = factory.createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
}
