package com.catpp.design_patterns.behaivor_type_12.state_pattern.state_pattern_ins;

import com.catpp.design_patterns.behaivor_type_12.state_pattern.state_pattern_ins.impl.Exit;
import com.catpp.design_patterns.behaivor_type_12.state_pattern.state_pattern_ins.impl.Play;
import com.catpp.design_patterns.behaivor_type_12.state_pattern.state_pattern_ins.impl.Prepare;

/**
 * com.catpp.design_patterns.behaivor_type_12.state_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description 使用Context查看当状态改变时的的行为变化
 */
public class Context {

    public static final Prepare PREPARE = new Prepare();
    public static final Play PLAY = new Play();
    public static final Exit EXIT = new Exit();

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);
    }

    public void prepare() {
        state.prepare();
    }

    public void play() {
        state.play();
    }

    public void exit() {
        state.exit();
    }
}
