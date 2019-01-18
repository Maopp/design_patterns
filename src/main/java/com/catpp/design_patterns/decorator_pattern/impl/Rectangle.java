package com.catpp.design_patterns.decorator_pattern.impl;

import com.catpp.design_patterns.decorator_pattern.Shape;

/**
 * com.catpp.design_patterns.decorator_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/18
 * @Description
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
