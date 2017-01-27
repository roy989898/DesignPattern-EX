package com.company;


import com.company.Menu.DinnerMenu;
import com.company.Menu.Menu;
import com.company.Menu.PancakeHouseMenu;


/**
 * Created by Roy.Leung on 25/1/17.
 */
public class Waiter {

    private Menu houseMenu;
    private Menu dinnerMenu;

    public Waiter(PancakeHouseMenu houseMenu, DinnerMenu dinnerMenu) {
        this.houseMenu = houseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        System.out.println("PancakeHouseMenu");
        printMenu(houseMenu.createIterator());
        System.out.println("-----------------------");
        System.out.println("DinnerMenu");
        printMenu(dinnerMenu.createIterator());
        System.out.println("-----------------------");


    }

    private void printMenu(java.util.Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + " " + menuItem.getDescription() + " " + menuItem.getPrice());
        }

    }


}
