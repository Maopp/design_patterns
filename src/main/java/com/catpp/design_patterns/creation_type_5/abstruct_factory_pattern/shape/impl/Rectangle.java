package com.catpp.design_patterns.creation_type_5.abstruct_factory_pattern.shape.impl;

import com.catpp.design_patterns.creation_type_5.abstruct_factory_pattern.shape.Shape;

/**
 * com.catpp.design_patterns.creation_type_5.factory_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/15
 * @Description 接口实现类
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.err.println("Inside Rectangle::draw() method.");
    }
}
