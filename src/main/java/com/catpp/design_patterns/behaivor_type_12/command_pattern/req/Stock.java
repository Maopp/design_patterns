package com.catpp.design_patterns.behaivor_type_12.command_pattern.req;

/**
 * com.catpp.design_patterns.behaivor_type_12.command_pattern.req
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description 请求类
 */
public class Stock {

    private String name = "ABC";

    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
