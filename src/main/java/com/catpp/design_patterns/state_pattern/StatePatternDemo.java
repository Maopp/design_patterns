package com.catpp.design_patterns.state_pattern;

import com.catpp.design_patterns.state_pattern.impl.StartState;
import com.catpp.design_patterns.state_pattern.impl.StopState;

/**
 * com.catpp.design_patterns.state_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description
 */
public class StatePatternDemo {

    public static void main(String[] args) {

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
