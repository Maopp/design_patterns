package com.catpp.design_patterns.java_ee_8.service_locator_pattern.cache;

import com.catpp.design_patterns.java_ee_8.service_locator_pattern.service.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * com.catpp.design_patterns.java_ee_8.service_locator_pattern.cache
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description
 */
public class Cache {

    private List<Service> services;

    public Cache(){
        services = new ArrayList<Service>();
    }

    public Service getService(String serviceName){
        for (Service service : services) {
            if(service.getName().equalsIgnoreCase(serviceName)){
                System.out.println("Returning cached  "+serviceName+" object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService){
        boolean exists = false;
        for (Service service : services) {
            if(service.getName().equalsIgnoreCase(newService.getName())){
                exists = true;
            }
        }
        if(!exists){
            services.add(newService);
        }
    }
}
