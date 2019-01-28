package com.catpp.design_patterns.creation_type_5.builder_pattern.item.entity;

import com.catpp.design_patterns.creation_type_5.builder_pattern.item.impl.ColdDrink;

/**
 * com.catpp.design_patterns.creation_type_5.builder_pattern.item.entity
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description 百事可乐实体类
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
