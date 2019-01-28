package com.catpp.design_patterns.java_ee_8.data_access_object_pattern.model;

/**
 * com.catpp.design_patterns.java_ee_8.data_access_object_pattern.model
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description
 */
public class Student {

    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
