package com.company;

/**
 * Created by Roy.Leung on 27/1/17.
 */
public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUAETER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;
    final String NO_SUPPORT_ACTION = "do not support action";
    int state = NO_QUAETER;/*initial state*/
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;

        if (count == 0) {
            state = SOLD_OUT;
        } else
            state = NO_QUAETER;
    }

    public void insertQuaeter() {
        switch (state) {
            case SOLD_OUT:
                System.out.println(NO_SUPPORT_ACTION);
                break;
            case NO_QUAETER:
                state = HAS_QUARTER;
                System.out.println("You enter a quarter");
                break;
            case HAS_QUARTER:
                System.out.println(NO_SUPPORT_ACTION);
                break;
            case SOLD:
                System.out.println(NO_SUPPORT_ACTION);
                break;
        }
    }

    public void ejectQuaeter() {
        switch (state) {
            case SOLD_OUT:
                System.out.println(NO_SUPPORT_ACTION);
                break;
            case NO_QUAETER:
                System.out.println(NO_SUPPORT_ACTION);
                break;
            case HAS_QUARTER:
                state = NO_QUAETER;
                System.out.println("Give you back a quarter");
                break;
            case SOLD:
                System.out.println(NO_SUPPORT_ACTION);
                break;
        }
    }

    public void turnCrank() {
        switch (state) {
            case SOLD_OUT:
                System.out.println(NO_SUPPORT_ACTION);
                break;
            case NO_QUAETER:
                System.out.println(NO_SUPPORT_ACTION);
                break;
            case HAS_QUARTER:
                state = SOLD;
                System.out.println("give you sweet");
                break;
            case SOLD:
                System.out.println(NO_SUPPORT_ACTION);
                break;
        }
    }

    public void dispense() {
        switch (state) {
            case SOLD_OUT:
                System.out.println(NO_SUPPORT_ACTION);
                break;
            case NO_QUAETER:
                System.out.println(NO_SUPPORT_ACTION);
                break;
            case HAS_QUARTER:
                System.out.println(NO_SUPPORT_ACTION);
                break;
            case SOLD:
                System.out.println("dispense ed");
                count--;
                if (count == 0) {
                    System.out.println("Oops,out of gumballs");
                    state = SOLD_OUT;
                } else {
                    state = NO_QUAETER;
                }
                break;
        }
    }

}
