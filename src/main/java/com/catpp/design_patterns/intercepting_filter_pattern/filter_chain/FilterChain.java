package com.catpp.design_patterns.intercepting_filter_pattern.filter_chain;

import com.catpp.design_patterns.intercepting_filter_pattern.filter.Filter;
import com.catpp.design_patterns.intercepting_filter_pattern.tartet.Target;

import java.util.ArrayList;
import java.util.List;

/**
 * com.catpp.design_patterns.intercepting_filter_pattern.filter_chain
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description 过滤器链
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<Filter>();

    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
