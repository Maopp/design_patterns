package com.catpp.design_patterns.transfer_object_pattern.transfer_object;

/**
 * com.catpp.design_patterns.transfer_object_pattern.transfer_object
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description 传输对象实体类
 */
public class StudentVO {

    private String name;

    private int rollNo;

    public StudentVO(String name, int rollNo) {
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
