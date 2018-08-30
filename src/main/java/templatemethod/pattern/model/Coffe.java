
package templatemethod.pattern.model;

import java.util.Scanner;

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
        String answer;
        System.out.print("Do you want condiments for your coffe? : ");
        try(Scanner scan = new Scanner(System.in)){
            
            answer = scan.next();
        }
        return answer;
    }

}
