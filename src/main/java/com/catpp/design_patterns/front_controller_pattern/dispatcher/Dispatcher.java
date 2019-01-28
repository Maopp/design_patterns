package com.catpp.design_patterns.front_controller_pattern.dispatcher;

import com.catpp.design_patterns.front_controller_pattern.view.HomeView;
import com.catpp.design_patterns.front_controller_pattern.view.StudentView;

/**
 * com.catpp.design_patterns.front_controller_pattern.dispatcher
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description 调度器
 */
public class Dispatcher {

    private StudentView studentView;

    private HomeView homeView;

    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
