package com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern.tartet;

/**
 * com.catpp.design_patterns.java_ee_8.intercepting_filter_pattern.tartet
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description
 */
public class Target {

    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
