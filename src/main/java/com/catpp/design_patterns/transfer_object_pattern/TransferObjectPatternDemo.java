package com.catpp.design_patterns.transfer_object_pattern;

import com.catpp.design_patterns.transfer_object_pattern.business_object.StudentBO;
import com.catpp.design_patterns.transfer_object_pattern.transfer_object.StudentVO;

/**
 * com.catpp.design_patterns.transfer_object_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/28
 * @Description
 */
public class TransferObjectPatternDemo {

    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        // 输出所有的学生
        for (StudentVO student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }

        // 更新学生
        StudentVO student =studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        // 获取学生
        studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}
