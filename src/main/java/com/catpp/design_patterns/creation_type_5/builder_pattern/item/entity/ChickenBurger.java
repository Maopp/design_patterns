package com.catpp.design_patterns.creation_type_5.builder_pattern.item.entity;

import com.catpp.design_patterns.creation_type_5.builder_pattern.item.impl.Burger;

/**
 * com.catpp.design_patterns.creation_type_5.builder_pattern.item.entity
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description 鸡肉汉堡实体类
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
