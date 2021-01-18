package com.abc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.service.SomeService;

/**
 * @desc:
 * @author: BinQi.Dai
 * @date: 2020/12/23
 */
@RestController
public class SomeController {
    @Autowired
    private SomeService service;

    @GetMapping("/some")
    public String someHandler() {
        return service.hello();
    }
}
