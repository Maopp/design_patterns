package com.catpp.design_patterns.null_pattern.impl;

import com.catpp.design_patterns.null_pattern.AbstractCustomer;

/**
 * com.catpp.design_patterns.null_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        super.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return super.name;
    }
}
