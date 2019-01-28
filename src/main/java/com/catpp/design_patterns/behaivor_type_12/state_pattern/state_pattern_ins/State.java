package com.catpp.design_patterns.behaivor_type_12.state_pattern.state_pattern_ins;

/**
 * com.catpp.design_patterns.behaivor_type_12.state_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description
 */
public abstract class State {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 准备开始
     */
    public abstract void prepare();

    /**
     * 玩游戏
     */
    public abstract void play();

    /**
     * 退出游戏
     */
    public abstract void exit();
}
