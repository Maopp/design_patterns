package com.catpp.design_patterns.behaivor_type_12.memento_pattern.memento;

/**
 * com.catpp.design_patterns.behaivor_type_12.memento_pattern.memento
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description 备忘录类
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
