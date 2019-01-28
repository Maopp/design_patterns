package com.catpp.design_patterns.behaivor_type_12.observer_pattern.impl;

import com.catpp.design_patterns.behaivor_type_12.observer_pattern.Observer;
import com.catpp.design_patterns.behaivor_type_12.observer_pattern.Subject;

/**
 * com.catpp.design_patterns.behaivor_type_12.observer_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
