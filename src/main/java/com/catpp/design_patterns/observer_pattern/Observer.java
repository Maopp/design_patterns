package com.catpp.design_patterns.observer_pattern;

/**
 * com.catpp.design_patterns.observer_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description 观察者抽象类
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
