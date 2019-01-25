package com.catpp.design_patterns.business_delegate_pattern.impl;

import com.catpp.design_patterns.business_delegate_pattern.BusinessService;

/**
 * com.catpp.design_patterns.business_delegate_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
