package com.company.Menu;

import com.company.MenuItem;

import java.util.Iterator;

/**
 * Created by Roy.Leung on 25/1/17.
 */
public interface Menu {
    public Iterator<MenuItem> createIterator();
}
