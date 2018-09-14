
package iterator.composite.pattern;

import iterator.composite.pattern.services.DinnerMenu;
import iterator.composite.pattern.services.PancakeHouseMenu;

public class MenuApp {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
