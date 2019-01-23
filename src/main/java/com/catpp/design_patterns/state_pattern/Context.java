package com.catpp.design_patterns.state_pattern;

/**
 * com.catpp.design_patterns.state_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
