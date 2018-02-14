package strategy.pattern;

import strategy.pattern.behavior.FlyWithWings;
import strategy.pattern.models.Duck;
import strategy.pattern.models.MallardDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performFly();
        mallard.performquack();
        mallard.swim();
        mallard.display();

        mallard.setFlyBehavior(new FlyWithWings());

        mallard.performFly();
    }
}
