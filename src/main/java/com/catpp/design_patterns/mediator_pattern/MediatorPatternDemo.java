package com.catpp.design_patterns.mediator_pattern;

/**
 * com.catpp.design_patterns.mediator_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {

        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi, John!");
        john.sendMessage("Hello, Robert!");
    }
}
