package com.catpp.design_patterns.behaivor_type_12.state_pattern.impl;

import com.catpp.design_patterns.behaivor_type_12.state_pattern.Context;
import com.catpp.design_patterns.behaivor_type_12.state_pattern.State;

/**
 * com.catpp.design_patterns.behaivor_type_12.state_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        context.setState(this);
        System.out.println("Stop State");
    }

    @Override
    public String toString() {
        return "StopState{}";
    }
}
