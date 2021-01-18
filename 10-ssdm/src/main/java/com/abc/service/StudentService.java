package com.abc.service;

import com.abc.bean.Student;

import java.util.List;

/**
 * @desc:
 * @author: BinQi.Dai
 * @date: 2020/12/23
 */
public interface StudentService {
    void addStudent(Student student) throws Exception;

    List<Student> findStudentsBelowAge(int age);

    Integer findStudentsCount();
}
