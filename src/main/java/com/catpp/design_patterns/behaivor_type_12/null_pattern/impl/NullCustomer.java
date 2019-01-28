package com.catpp.design_patterns.behaivor_type_12.null_pattern.impl;

import com.catpp.design_patterns.behaivor_type_12.null_pattern.AbstractCustomer;

/**
 * com.catpp.design_patterns.behaivor_type_12.null_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
