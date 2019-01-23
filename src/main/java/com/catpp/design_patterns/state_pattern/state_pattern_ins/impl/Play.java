package com.catpp.design_patterns.state_pattern.state_pattern_ins.impl;

import com.catpp.design_patterns.state_pattern.state_pattern_ins.Context;
import com.catpp.design_patterns.state_pattern.state_pattern_ins.State;

/**
 * com.catpp.design_patterns.state_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description
 */
public class Play extends State {
    @Override
    public void prepare() {
    }

    @Override
    public void play() {
        System.out.println("玩游戏。。。");
        context.setState(Context.EXIT);
    }

    @Override
    public void exit() {

    }
}
