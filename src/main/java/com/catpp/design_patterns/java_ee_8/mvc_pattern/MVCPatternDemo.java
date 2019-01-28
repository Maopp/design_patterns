package com.catpp.design_patterns.java_ee_8.mvc_pattern;

import com.catpp.design_patterns.java_ee_8.mvc_pattern.controller.StudentController;
import com.catpp.design_patterns.java_ee_8.mvc_pattern.model.Student;
import com.catpp.design_patterns.java_ee_8.mvc_pattern.view.StudentView;

/**
 * com.catpp.design_patterns.java_ee_8.mvc_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description
 */
public class MVCPatternDemo {

    public static void main(String[] args) {

        //从数据库获取学生记录
        Student model  = retriveStudentFromDatabase();

        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
