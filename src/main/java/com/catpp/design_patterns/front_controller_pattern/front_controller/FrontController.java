package com.catpp.design_patterns.front_controller_pattern.front_controller;

import com.catpp.design_patterns.front_controller_pattern.dispatcher.Dispatcher;

/**
 * com.catpp.design_patterns.front_controller_pattern.front_controller
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description 前端控制器
 */
public class FrontController {

    private Dispatcher dispatcher;

    public FrontController(){
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request){
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}
