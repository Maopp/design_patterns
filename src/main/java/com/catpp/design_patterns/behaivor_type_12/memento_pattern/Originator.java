package com.catpp.design_patterns.behaivor_type_12.memento_pattern;

import com.catpp.design_patterns.behaivor_type_12.memento_pattern.memento.Memento;

/**
 * com.catpp.design_patterns.behaivor_type_12.memento_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description 创建备忘录，存储状态
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }
}
