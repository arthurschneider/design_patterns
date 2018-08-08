
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
    boolean customerWantsCondiments() {
        String answer = askCustomerAboutCondiments();
        return answer.toLowerCase().startsWith("y") || answer.toLowerCase().startsWith("j");
    }

    private String askCustomerAboutCondiments() {
        System.out.print("Do you want condiments for your coffe? : ");

        return  System.console().readLine();
    }

}
