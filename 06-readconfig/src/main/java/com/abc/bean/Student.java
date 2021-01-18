package com.abc.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @desc:
 * @author: BinQi.Dai
 * @date: 2020/12/23
 */
@Component
@PropertySource(value = "classpath:custom.properties",encoding = "utf-8")
@ConfigurationProperties("student")
public class Student {
    private String name;
    private int age;
    private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", score=" + score + '}';
    }
}
