package com.catpp.design_patterns.behaivor_type_12.memento_pattern;

import com.catpp.design_patterns.behaivor_type_12.memento_pattern.memento.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * com.catpp.design_patterns.behaivor_type_12.memento_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description 从Memento恢复对象的状态
 */
public class CareTaker {

    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index) {
        return mementos.get(index);
    }
}
