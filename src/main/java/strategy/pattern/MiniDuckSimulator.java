package strategy.pattern;

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
