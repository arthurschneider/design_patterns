package strategy.pattern;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I am a mallard duck !");
    }
    
}
