package com.catpp.design_patterns.java_ee_8.business_delegate_pattern;

/**
 * com.catpp.design_patterns.java_ee_8.business_delegate_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("JMS");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("EJB");
        client.doTask();
    }
}
