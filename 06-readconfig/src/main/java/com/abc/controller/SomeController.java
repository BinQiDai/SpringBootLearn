package com.abc.controller;

import com.abc.bean.Company;
import com.abc.bean.Country;
import com.abc.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc:
 * @author: BinQi.Dai
 * @date: 2020/12/23
 */
@RestController
public class SomeController {
    @Value("${server.port}")
    private int port;
    @Value("${company.name}")
    private String name;
    @Autowired
    private Student student;

    @Autowired
    private Country country;
    @Autowired
    private Company company;

    @GetMapping("/port")
    public String portHandle() {
        return "port is " + port;
    }

    @GetMapping("/name")
    public String nameHandle() {
        return "company name is " + name;
    }

    @GetMapping("/student")
    public String studentHandle() {
        return "student is " + student.toString();
    }
    @GetMapping("/country")
    public String countryHandle() {
        return "country is " + country.getCities();
    }
    @GetMapping("/depart")
    public String departHandle() {
        return "depart is " + company.getDepart().toString();
    }
}
