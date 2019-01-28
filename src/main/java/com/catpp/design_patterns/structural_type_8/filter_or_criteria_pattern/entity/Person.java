package com.catpp.design_patterns.structural_type_8.filter_or_criteria_pattern.entity;

/**
 * com.catpp.design_patterns.structural_type_8.filter_or_criteria_pattern.entity
 *
 * @Author cat_pp
 * @Date 2019/1/18
 * @Description 应用标准的实体类
 */
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
