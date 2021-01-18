package com.abc.controller;

import com.abc.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc:
 * @author: BinQi.Dai
 * @date: 2020/12/23
 */
@RestController
public class SomeController {


    @GetMapping("/first/some")
    public String firstHandler() {
        return "first method";
    }
    @GetMapping("/second/some")
    public String secondHandler() {
        return "second method";
    }
    @GetMapping("/third/some")
    public String someHandler() {
        return "third method";
    }
}
