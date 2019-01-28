package com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern.filter.impl;

import com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern.filter.Filter;

/**
 * com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern.filter.impl
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
