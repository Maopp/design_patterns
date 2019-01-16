package com.catpp.design_patterns.builder_pattern.item;

import com.catpp.design_patterns.builder_pattern.packing.Packing;

/**
 * com.catpp.design_patterns.builder_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description 食物条目接口类
 */
public interface Item {

    String name();
    String packing();
    float price();
}
