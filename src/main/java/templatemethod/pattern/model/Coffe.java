package templatemethod.pattern.model;


/**
 * @author aschneider
 * @since 08.08.2018
 */

public class Coffe extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
    
    @Override
    void someHook() {
        System.out.println("Bring coffe to the customer table");
    }

}
