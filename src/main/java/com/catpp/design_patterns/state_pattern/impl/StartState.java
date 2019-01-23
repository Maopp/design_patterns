package com.catpp.design_patterns.state_pattern.impl;

import com.catpp.design_patterns.state_pattern.Context;
import com.catpp.design_patterns.state_pattern.State;

/**
 * com.catpp.design_patterns.state_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        context.setState(this);
        System.out.println("Start State");
    }

    @Override
    public String toString() {
        return "StartState{}";
    }
}
