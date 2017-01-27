package com.company;

import com.company.Menu.DinnerMenu;
import com.company.Menu.PancakeHouseMenu;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Waiter may = new Waiter(new PancakeHouseMenu(), new DinnerMenu());
        may.printMenu();

    }
}
