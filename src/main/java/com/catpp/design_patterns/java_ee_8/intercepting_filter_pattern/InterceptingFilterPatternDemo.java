package com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern;

import com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern.client.Client;
import com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern.filter.impl.AuthenticationFilter;
import com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern.filter.impl.DebugFilter;
import com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern.filter_manager.FilterManager;
import com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern.tartet.Target;

/**
 * com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description
 */
public class InterceptingFilterPatternDemo {

    public static void main(String[] args) {

        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
