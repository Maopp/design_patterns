package com.catpp.design_patterns.data_access_object_pattern.dao.impl;

import com.catpp.design_patterns.data_access_object_pattern.dao.StudentDao;
import com.catpp.design_patterns.data_access_object_pattern.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * com.catpp.design_patterns.data_access_object_pattern.dao.impl
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description
 */
public class StudentDaoImpl implements StudentDao {

    /**
     * 列表是当作一个数据库
     */
    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<Student>();
        Student student1 = new Student("Robert",0);
        Student student2 = new Student("John",1);
        students.add(student1);
        students.add(student2);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
    }
}
