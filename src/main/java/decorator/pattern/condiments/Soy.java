package decorator.pattern.condiments;

import decorator.pattern.beverages.Beverage;
import decorator.pattern.beverages.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }

}
