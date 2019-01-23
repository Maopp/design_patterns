package com.catpp.design_patterns.null_pattern.factory;

import com.catpp.design_patterns.null_pattern.AbstractCustomer;
import com.catpp.design_patterns.null_pattern.impl.NullCustomer;
import com.catpp.design_patterns.null_pattern.impl.RealCustomer;

/**
 * com.catpp.design_patterns.null_pattern.factory
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    /**
     * 根据名字获取学生对象
     *
     * @param name
     * @return
     */
    public static AbstractCustomer getCustomer(String name) {
        for (String string : names) {
            if (string.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
