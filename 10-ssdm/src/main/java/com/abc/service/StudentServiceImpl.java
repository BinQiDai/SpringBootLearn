package com.abc.service;

import com.abc.bean.Student;
import com.abc.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @desc:
 * @author: BinQi.Dai
 * @date: 2020/12/23
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper dao;
    @Autowired
    private RedisTemplate redisTemplate;

    @CacheEvict(value = "realTimeCache",allEntries = true)
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addStudent(Student student) throws Exception {
        dao.insertStudent(student);

    }

    @Cacheable(value = "realTimeCache",key = "'student_'+#age")
    @Override
    public List<Student> findStudentsBelowAge(int age) {
        return dao.findStudentsBelowAge(age);
    }

    @Override
    public Integer findStudentsCount() {

        // 获取Redis操作对象
        BoundValueOperations<Object, Object> ops = redisTemplate.boundValueOps("count");
        // 从Redis中获得指定key的值
        Object count=ops.get();
        // 双重检测
        if(count==null){
            synchronized (this){
                count=ops.get();
                if(count==null){
                    count=dao.findStudentsCount();
                    // 将查询结果放到Redis
                    ops.set(count,60, TimeUnit.SECONDS);
                }
            }
        }
        return (Integer) count;
    }
}
