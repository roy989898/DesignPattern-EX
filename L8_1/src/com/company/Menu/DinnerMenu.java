package com.company.Menu;

import com.company.Iterator.DinerMenuIterator;
import com.company.MenuItem;

/**
 * Created by Roy.Leung on 25/1/17.
 */
public class DinnerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;


    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("VBLT", "good", true, 2.99);
        addItem("A", "good", true, 6.99);
        addItem("B", "good", true, 5.99);
        addItem("C", "good", true, 4.99);
        addItem("D", "good", true, 3.99);
        addItem("E", "good", true, 3.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry,MAX");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;

        }
    }

    /*public MenuItem[] getMenuItems() {
        return menuItems;
    }*/

    @Override
    public java.util.Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
