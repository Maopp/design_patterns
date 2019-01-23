package com.catpp.design_patterns.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * com.catpp.design_patterns.observer_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description 带有绑定观察者到 Client 对象和从 Client 对象解绑观察者的方法
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
