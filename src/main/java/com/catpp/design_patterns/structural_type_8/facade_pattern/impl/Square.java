package com.catpp.design_patterns.structural_type_8.facade_pattern.impl;

import com.catpp.design_patterns.structural_type_8.facade_pattern.Shape;

/**
 * com.catpp.design_patterns.structural_type_8.facade_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/18
 * @Description
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
