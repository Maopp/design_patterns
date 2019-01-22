package com.catpp.design_patterns.iterator_pattern.iterator.impl;

import com.catpp.design_patterns.iterator_pattern.iterator.Container;
import com.catpp.design_patterns.iterator_pattern.iterator.Iterator;

/**
 * com.catpp.design_patterns.iterator_pattern.iterator.impl
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description
 */
public class NameRepository implements Container {

    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
