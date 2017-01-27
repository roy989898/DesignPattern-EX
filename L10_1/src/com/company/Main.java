package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        GumballMachine machine = new GumballMachine(0);
        machine.insertQuaeter();
        machine.turnCrank();
        machine.dispense();

        machine.insertQuaeter();
        machine.turnCrank();
        machine.dispense();

        machine.insertQuaeter();
        machine.turnCrank();
        machine.dispense();
    }
}
