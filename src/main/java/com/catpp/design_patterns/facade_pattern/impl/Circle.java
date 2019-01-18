package com.catpp.design_patterns.facade_pattern.impl;

import com.catpp.design_patterns.facade_pattern.Shape;

/**
 * com.catpp.design_patterns.facade_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/18
 * @Description
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
