package com.catpp.design_patterns.java_ee_8.business_delegate_pattern.query_service;

import com.catpp.design_patterns.java_ee_8.business_delegate_pattern.BusinessService;
import com.catpp.design_patterns.java_ee_8.business_delegate_pattern.impl.EJBService;
import com.catpp.design_patterns.java_ee_8.business_delegate_pattern.impl.JMSService;

/**
 * com.catpp.design_patterns.java_ee_8.business_delegate_pattern.query_service
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description 业务查询服务类
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType) {
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
