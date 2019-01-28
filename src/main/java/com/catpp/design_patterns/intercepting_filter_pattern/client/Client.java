package com.catpp.design_patterns.intercepting_filter_pattern.client;

import com.catpp.design_patterns.intercepting_filter_pattern.filter_manager.FilterManager;

/**
 * com.catpp.design_patterns.intercepting_filter_pattern.client
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description 客户端类
 */
public class Client {

    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
