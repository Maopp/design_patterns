package com.catpp.design_patterns.service_locator_pattern;

import com.catpp.design_patterns.service_locator_pattern.service.Service;
import com.catpp.design_patterns.service_locator_pattern.service_locator.ServiceLocator;

/**
 * com.catpp.design_patterns.service_locator_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description
 */
public class ServiceLocatorPatternDemo {

    public static void main(String[] args) {

        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
