package com.abc.service;

import com.abc.bean.Student;
import com.abc.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @desc:
 * @author: BinQi.Dai
 * @date: 2020/12/23
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper dao;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addStudent(Student student) throws Exception {
        dao.insertStudent(student);
        if(true){
            throw new Exception("异常");
        }
    }
}
