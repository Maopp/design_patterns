package com.catpp.design_patterns.template_pattern;

/**
 * com.catpp.design_patterns.template_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description
 */
public abstract class Game {

    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    /**
     * 模板方法
     */
    public final void play() {
        // 初始化游戏
        initialize();
        // 开始游戏
        startPlay();
        // 结束游戏
        endPlay();
    }
}
