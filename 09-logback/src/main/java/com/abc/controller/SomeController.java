package com.abc.controller;

import com.abc.bean.Student;
import com.abc.service.SomeService;
import com.abc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @desc:
 * @author: BinQi.Dai
 * @date: 2020/12/23
 */
@Controller
@RequestMapping("/some")
public class SomeController {
    @Autowired
    private SomeService service;
    @Autowired
    private StudentService studentService;

    @PostMapping("/register")
    public String registerHandler(Student student, Model model) throws Exception {
        studentService.addStudent(student);
        model.addAttribute("student",student);

        return "jsp/welcome";
    }
}
