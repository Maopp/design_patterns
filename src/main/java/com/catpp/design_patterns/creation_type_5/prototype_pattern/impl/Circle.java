package com.catpp.design_patterns.creation_type_5.prototype_pattern.impl;

import com.catpp.design_patterns.creation_type_5.prototype_pattern.Shape;

/**
 * com.catpp.design_patterns.creation_type_5.prototype_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description 实体类
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    protected void draw() {
        System.err.println("Inside Circle::draw() method.");
    }
}
