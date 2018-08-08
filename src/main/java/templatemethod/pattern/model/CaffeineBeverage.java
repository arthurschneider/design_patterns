
package templatemethod.pattern.model;

/**
 * @author aschneider
 * @since 08.08.2018
 */

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        
        someHook();
    }

    abstract void brew();

    abstract void addCondiments();

    private void boilWater() {
        System.out.println("Boiling  water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
    
    void someHook(){
        System.out.println("Place beverage on the counter and call customer");
    }
}
