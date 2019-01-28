package com.catpp.design_patterns.java_ee_8.composite_entity_pattern;

import com.catpp.design_patterns.java_ee_8.composite_entity_pattern.client.Client;

/**
 * com.catpp.design_patterns.java_ee_8.composite_entity_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description
 */
public class CompositeEntityPatternDemo {

    public static void main(String[] args) {

        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
