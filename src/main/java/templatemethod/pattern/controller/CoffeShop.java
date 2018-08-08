
package templatemethod.pattern.controller;

import templatemethod.pattern.model.Coffe;
import templatemethod.pattern.model.Tea;

/**
 * @author aschneider
 * @since 08.08.2018
 */

public class CoffeShop {

    public static void main(String[] args) {

        System.out.println("--------------Making tea---------------");
        Tea tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\n\n");
        System.out.println("--------------Making coffe-------------");
        Coffe coffe = new Coffe();
        coffe.prepareRecipe();

    }

}
