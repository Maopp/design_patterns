package com.catpp.design_patterns.java_ee_8.business_delegate_pattern;

/**
 * com.catpp.design_patterns.java_ee_8.business_delegate_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description 客户端类
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
