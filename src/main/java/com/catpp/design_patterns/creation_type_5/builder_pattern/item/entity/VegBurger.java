package com.catpp.design_patterns.creation_type_5.builder_pattern.item.entity;

import com.catpp.design_patterns.creation_type_5.builder_pattern.item.impl.Burger;

/**
 * com.catpp.design_patterns.creation_type_5.builder_pattern.item.entity
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description 素食汉堡实体类
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
