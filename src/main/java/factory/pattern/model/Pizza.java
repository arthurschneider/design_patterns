package factory.pattern.model;

public interface Pizza {
    
    public enum PizzaTyp{
        CHEESE, CLAM, PEPPERONI, VEGGIE
    }

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();

}
