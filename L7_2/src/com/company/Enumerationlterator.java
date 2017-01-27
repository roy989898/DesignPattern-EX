package com.company;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Roy.Leung on 17/1/17.
 */
public class Enumerationlterator implements Iterator {
    private Enumeration mEnum;

    public Enumerationlterator(Enumeration mEnum) {
        this.mEnum = mEnum;
    }

    @Override
    public boolean hasNext() {
        return mEnum.hasMoreElements();
    }

    @Override
    public Object next() {
        return mEnum.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
