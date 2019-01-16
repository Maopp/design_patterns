package com.catpp.design_patterns.builder_pattern.item.entity;

import com.catpp.design_patterns.builder_pattern.item.impl.ColdDrink;

/**
 * com.catpp.design_patterns.builder_pattern.item.entity
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description 可口可乐实体类
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
