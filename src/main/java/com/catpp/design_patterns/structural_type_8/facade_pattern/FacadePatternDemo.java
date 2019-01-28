package com.catpp.design_patterns.structural_type_8.facade_pattern;

import com.catpp.design_patterns.structural_type_8.facade_pattern.facade.ShapeMaker;

/**
 * com.catpp.design_patterns.structural_type_8.facade_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/18
 * @Description
 */
public class FacadePatternDemo {

    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
