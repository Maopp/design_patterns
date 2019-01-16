package com.catpp.design_patterns.prototype_pattern.impl;

import com.catpp.design_patterns.prototype_pattern.Shape;

/**
 * com.catpp.design_patterns.prototype_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description 实体类
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    protected void draw() {
        System.err.println("Inside Rectangle::draw() method.");
    }
}
