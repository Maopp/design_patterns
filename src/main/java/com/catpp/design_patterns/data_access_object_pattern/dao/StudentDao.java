package com.catpp.design_patterns.data_access_object_pattern.dao;

import com.catpp.design_patterns.data_access_object_pattern.model.Student;

import java.util.List;

/**
 * com.catpp.design_patterns.data_access_object_pattern.dao
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description
 */
public interface StudentDao {

    List<Student> getAllStudents();

    Student getStudent(int rollNo);

    void updateStudent(Student student);

    void deleteStudent(Student student);
}
