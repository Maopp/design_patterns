package com.catpp.design_patterns.creation_type_5.prototype_pattern.impl;

import com.catpp.design_patterns.creation_type_5.prototype_pattern.Shape;

/**
 * com.catpp.design_patterns.creation_type_5.prototype_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description 实体类
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    protected void draw() {
        System.err.println("Inside Square::draw() method.");
    }
}
