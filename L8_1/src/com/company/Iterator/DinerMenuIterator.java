package com.company.Iterator;

import com.company.MenuItem;

import java.util.*;

/**
 * Created by Roy.Leung on 25/1/17.
 */
public class DinerMenuIterator implements java.util.Iterator<MenuItem> {

    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {

        if (position >= items.length || items[position] == null)
            return false;
        else
            return true;
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position++;
        return item;
    }

    @Override
    public void remove() {

    }
}
