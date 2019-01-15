package com.catpp.design_patterns.abstruct_factory_pattern.shape.impl;

import com.catpp.design_patterns.abstruct_factory_pattern.shape.Shape;

/**
 * com.catpp.design_patterns.factory_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/15
 * @Description 接口实现类
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.err.println("Inside Square::draw() method.");
    }
}
