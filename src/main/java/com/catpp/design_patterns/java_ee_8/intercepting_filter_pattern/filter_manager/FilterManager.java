package com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern.filter_manager;

import com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern.filter.Filter;
import com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern.filter_chain.FilterChain;
import com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern.tartet.Target;

/**
 * com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern.filter_manager
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description 过滤管理器类
 */
public class FilterManager {

    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
