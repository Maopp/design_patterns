package com.catpp.design_patterns.service_locator_pattern.service_locator;

import com.catpp.design_patterns.service_locator_pattern.cache.Cache;
import com.catpp.design_patterns.service_locator_pattern.context.InitialContext;
import com.catpp.design_patterns.service_locator_pattern.service.Service;

/**
 * com.catpp.design_patterns.service_locator_pattern.service_locator
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description 服务定位器类
 */
public class ServiceLocator {

    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName){

        Service service = cache.getService(jndiName);

        if(service != null){
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
