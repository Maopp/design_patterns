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
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
