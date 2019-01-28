package com.catpp.design_patterns.java_ee_8.mvc_pattern.view;

/**
 * com.catpp.design_patterns.java_ee_8.mvc_pattern.view
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description
 */
public class StudentView {

    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
