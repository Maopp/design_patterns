package com.catpp.design_patterns.java_ee_8.mvc_pattern.controller;

import com.catpp.design_patterns.java_ee_8.mvc_pattern.model.Student;
import com.catpp.design_patterns.java_ee_8.mvc_pattern.view.StudentView;

/**
 * com.catpp.design_patterns.java_ee_8.mvc_pattern.controller
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description
 */
public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
