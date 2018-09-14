
package iterator.composite.pattern.services;

import java.util.Iterator;

import iterator.composite.pattern.iterators.DinnerMenuIterator;
import iterator.composite.pattern.models.MenuItem;

public class DinnerMenu implements Menu {

    private static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegeterian BLT", "(Fakin´) Bacon with lettuce & tomato on whole wheat", true, 5.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 6.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 4.99);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 5.99);

    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems < MAX_ITEMS) {
            menuItems[numberOfItems] = item;
            numberOfItems++;
        } else {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
