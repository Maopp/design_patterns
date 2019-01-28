package com.catpp.design_patterns.intercepting_filter_pattern.filter;

/**
 * com.catpp.design_patterns.intercepting_filter_pattern.filter
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description 过滤器接口类
 */
public interface Filter {

    void execute(String request);
}
