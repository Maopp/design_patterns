package com.catpp.design_patterns.behaivor_type_12.template_pattern.sub;

import com.catpp.design_patterns.behaivor_type_12.template_pattern.Game;

/**
 * com.catpp.design_patterns.behaivor_type_12.template_pattern.sub
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description
 */
public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
