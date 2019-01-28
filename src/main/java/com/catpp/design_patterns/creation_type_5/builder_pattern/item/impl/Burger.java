package com.catpp.design_patterns.creation_type_5.builder_pattern.item.impl;

import com.catpp.design_patterns.creation_type_5.builder_pattern.item.Item;
import com.catpp.design_patterns.creation_type_5.builder_pattern.packing.Packing;
import com.catpp.design_patterns.creation_type_5.builder_pattern.packing.impl.Wrapper;

/**
 * com.catpp.design_patterns.creation_type_5.builder_pattern.item.impl
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description 实现条目接口的抽象类，提供默认的功能
 */
public abstract class Burger implements Item {

    @Override
    public String packing() {
        return new Wrapper().pack();
    }

    @Override
    public abstract float price();
}
