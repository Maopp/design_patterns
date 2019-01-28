package com.catpp.design_patterns.structural_type_8.bridge_pattern;

import com.catpp.design_patterns.structural_type_8.bridge_pattern.entity.Circle;
import com.catpp.design_patterns.structural_type_8.bridge_pattern.impl.GreenCircle;
import com.catpp.design_patterns.structural_type_8.bridge_pattern.impl.RedCircle;

/**
 * com.catpp.design_patterns.structural_type_8.bridge_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/17
 * @Description
 */
public class BridgePatternDemo {

    public static void main(String[] args) {

        Shape redCircle = new Circle(new RedCircle(), 100,100, 10);
        Shape greenCircle = new Circle(new GreenCircle(), 100,100, 10);

        redCircle.draw();
        greenCircle.draw();
    }
}
