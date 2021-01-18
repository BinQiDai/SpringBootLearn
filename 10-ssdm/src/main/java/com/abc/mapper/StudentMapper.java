package com.abc.mapper;

import com.abc.bean.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @desc:
 * @author: BinQi.Dai
 * @date: 2020/12/23
 */
@Mapper
public interface StudentMapper {

    void insertStudent(Student student);

    List<Student> findStudentsBelowAge(int age);

    Integer findStudentsCount();
}
