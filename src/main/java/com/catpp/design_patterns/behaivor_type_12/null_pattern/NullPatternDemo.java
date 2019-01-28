package com.catpp.design_patterns.behaivor_type_12.null_pattern;

import com.catpp.design_patterns.behaivor_type_12.null_pattern.factory.CustomerFactory;

/**
 * com.catpp.design_patterns.behaivor_type_12.null_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description
 */
public class NullPatternDemo {

    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers：");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
