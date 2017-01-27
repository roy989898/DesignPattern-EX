package com.company;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Roy.Leung on 17/1/17.
 */
public class MakeIteratoelikeEnumerator implements Enumeration {
    private Iterator iterator;

    public MakeIteratoelikeEnumerator(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
