package com.company.Menu;


import com.company.MenuItem;

import java.util.ArrayList;

/**
 * Created by Roy.Leung on 25/1/17.
 */
public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("A&B 's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fired eggs, and toast", false, 2.99);
        addItem("Blueberry Pancake", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or starwberries", true, 3.59);


    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);

    }

   /* public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }*/

    @Override
    public java.util.Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
