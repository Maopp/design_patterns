package com.catpp.design_patterns.state_pattern.state_pattern_ins.impl;

import com.catpp.design_patterns.state_pattern.state_pattern_ins.State;

/**
 * com.catpp.design_patterns.state_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description
 */
public class Exit extends State {
    @Override
    public void prepare() {

    }

    @Override
    public void play() {

    }

    @Override
    public void exit() {
        System.out.println("退出游戏。。。");
    }
}
