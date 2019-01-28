package com.catpp.design_patterns.service_locator_pattern.context;

import com.catpp.design_patterns.service_locator_pattern.service.impl.Service1;
import com.catpp.design_patterns.service_locator_pattern.service.impl.Service2;

/**
 * com.catpp.design_patterns.service_locator_pattern.context
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description
 */
public class InitialContext {

    public Object lookup(String jndiName) {
        if(jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        }else if (jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}
