package com.catpp.design_patterns.java_ee_8.business_delegate_pattern;

import com.catpp.design_patterns.java_ee_8.business_delegate_pattern.query_service.BusinessLookUp;

/**
 * com.catpp.design_patterns.java_ee_8.business_delegate_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description 业务代表类
 */
public class BusinessDelegate {

    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
