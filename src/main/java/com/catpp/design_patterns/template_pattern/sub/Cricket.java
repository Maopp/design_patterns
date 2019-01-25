package com.catpp.design_patterns.template_pattern.sub;

import com.catpp.design_patterns.template_pattern.Game;

/**
 * com.catpp.design_patterns.template_pattern.sub
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description
 */
public class Cricket extends Game {
    @Override
    public void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
