package com.catpp.design_patterns.template_pattern;

import com.catpp.design_patterns.template_pattern.sub.Cricket;
import com.catpp.design_patterns.template_pattern.sub.Football;

/**
 * com.catpp.design_patterns.template_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        game = new Football();
        game.play();
    }
}
