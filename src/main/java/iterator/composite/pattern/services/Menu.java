
package iterator.composite.pattern.services;

import java.util.Iterator;

import iterator.composite.pattern.models.MenuItem;

public interface Menu {

    public Iterator<MenuItem> createIterator();
}
