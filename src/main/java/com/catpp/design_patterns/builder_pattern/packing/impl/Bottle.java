package com.catpp.design_patterns.builder_pattern.packing.impl;

import com.catpp.design_patterns.builder_pattern.packing.Packing;

/**
 * com.catpp.design_patterns.builder_pattern.packing.impl
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description 实现包装接口的实体类
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
