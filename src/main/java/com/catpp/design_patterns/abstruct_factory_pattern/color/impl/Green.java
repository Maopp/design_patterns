package com.catpp.design_patterns.abstruct_factory_pattern.color.impl;

import com.catpp.design_patterns.abstruct_factory_pattern.color.Color;

/**
 * com.catpp.design_patterns.abstruct_factory_pattern.color.impl
 *
 * @Author cat_pp
 * @Date 2019/1/15
 * @Description 接口实现类
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.err.println("Inside Green::fill() method.");
    }
}
