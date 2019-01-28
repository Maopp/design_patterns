package com.catpp.design_patterns.java_ee_8.front_controller_pattern;

import com.catpp.design_patterns.java_ee_8.front_controller_pattern.front_controller.FrontController;

/**
 * com.catpp.design_patterns.java_ee_8.front_controller_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description
 */
public class FrontControllerPatternDemo {

    public static void main(String[] args) {

        FrontController frontController = new FrontController();

        frontController.dispatchRequest("STUDENT");

        frontController.dispatchRequest("HOME");
    }
}
