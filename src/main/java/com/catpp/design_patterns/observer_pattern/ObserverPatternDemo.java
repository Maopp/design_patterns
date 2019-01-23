package com.catpp.design_patterns.observer_pattern;

import com.catpp.design_patterns.observer_pattern.impl.BinaryObserver;
import com.catpp.design_patterns.observer_pattern.impl.HexObserver;
import com.catpp.design_patterns.observer_pattern.impl.OctalObserver;

/**
 * com.catpp.design_patterns.observer_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println();

        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
