package com.catpp.design_patterns.creation_type_5.builder_pattern.item.impl;

import com.catpp.design_patterns.creation_type_5.builder_pattern.item.Item;
import com.catpp.design_patterns.creation_type_5.builder_pattern.packing.Packing;
import com.catpp.design_patterns.creation_type_5.builder_pattern.packing.impl.Bottle;

/**
 * com.catpp.design_patterns.creation_type_5.builder_pattern.item.impl
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description
 */
public abstract class ColdDrink implements Item {
    @Override
    public String packing() {
        return new Bottle().pack();
    }

    @Override
    public abstract float price();
}
