package com.catpp.design_patterns.composite_pattern.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * com.catpp.design_patterns.composite_pattern.entity
 *
 * @Author cat_pp
 * @Date 2019/1/18
 * @Description
 */
public class Employee {

    private String name;
    private String dept;
    private float salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, float salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<Employee>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
