package com.company;

import com.company.animal.duck.Duck;
import com.company.animal.duck.TurkeyAdapter;
import com.company.animal.turkey.WildTurkey;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Duck duck = new TurkeyAdapter(new WildTurkey());
        duck.fly();
        duck.quack();

    }
}