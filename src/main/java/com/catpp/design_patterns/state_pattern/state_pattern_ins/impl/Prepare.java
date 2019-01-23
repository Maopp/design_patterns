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
public class Prepare extends State {

    @Override
    public void prepare() {
        System.out.println("准备开始。。。");
        context.setState(Context.PLAY);
    }

    @Override
    public void play() {
    }

    @Override
    public void exit() {
    }
}
