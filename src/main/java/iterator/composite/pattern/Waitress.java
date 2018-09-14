
package iterator.composite.pattern;

import java.util.Iterator;

import iterator.composite.pattern.models.MenuItem;
import iterator.composite.pattern.services.Menu;

public class Waitress {

    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();

        System.out.println("MENU\n----");

        System.out.println("----Breakfast----");
        printMenu(pancakeIterator);

        System.out.println("----Lunch----");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator<MenuItem> pancakeIterator) {
        while (pancakeIterator.hasNext()) {
            MenuItem item = pancakeIterator.next();
            System.out.println(item.getName() + ", " + item.getDescription() + " -- " + item.getPrice());
        }
    }
}
