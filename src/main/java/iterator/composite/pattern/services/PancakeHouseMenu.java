
package iterator.composite.pattern.services;

import java.util.ArrayList;
import java.util.Iterator;

import iterator.composite.pattern.models.MenuItem;

public class PancakeHouseMenu implements Menu{

    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B`s Pancake Breakfast", "Pankakes with scrambled eggs and toast", true, 5.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs and sausage", false, 6.99);
        addItem("Blueberry Pancakes", "Pancakes with fresh blueberries", true, 4.99);
        addItem("Waffles", "Waffles with blueberries or strawberries", true, 5.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        menuItems.add(item);
    }

    public Iterator<MenuItem> createIterator(){
        return menuItems.iterator();
    }

}
