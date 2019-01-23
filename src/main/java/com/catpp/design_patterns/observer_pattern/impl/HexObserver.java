package com.catpp.design_patterns.observer_pattern.impl;

import com.catpp.design_patterns.observer_pattern.Observer;
import com.catpp.design_patterns.observer_pattern.Subject;

/**
 * com.catpp.design_patterns.observer_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description
 */
public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
