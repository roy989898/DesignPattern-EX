package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> stringList = new ArrayList<>();
        initStringArrayList(stringList);
        MakeIteratoelikeEnumerator makeIteratoelikeEnumerator = new MakeIteratoelikeEnumerator(stringList.iterator());
        while (makeIteratoelikeEnumerator.hasMoreElements()) {
            System.out.println((String) makeIteratoelikeEnumerator.nextElement());
        }

    }

    static private void initStringArrayList(ArrayList<String> stringList) {

        stringList.add("A");
        stringList.add("V");
        stringList.add("D");
        stringList.add("E");
        stringList.add("R");
    }
}
