package templatemethod.pattern.model;


/**
 * @author aschneider
 * @since 08.08.2018
 */

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

}
