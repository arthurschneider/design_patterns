package strategy.pattern.models;

import strategy.pattern.behavior.FlyBehavior;
import strategy.pattern.behavior.QuackBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    
    public abstract void display();
    
    public void performquack() {
        quackBehavior.quack();
    }
    
    public void performFly() {
        flyBehavior.fly();
    }
    
    public void swim() {
        System.out.println("All ducks can float, even decoys!");
    }

   

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

   

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
