package com.catpp.design_patterns.java_ee_8.service_locator_pattern.service.impl;

import com.catpp.design_patterns.java_ee_8.service_locator_pattern.service.Service;

/**
 * com.catpp.design_patterns.java_ee_8.service_locator_pattern.service.impl
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description
 */
public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
