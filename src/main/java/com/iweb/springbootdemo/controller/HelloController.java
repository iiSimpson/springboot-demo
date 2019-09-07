package com.iweb.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyi
 * @date 2019/8/31 9:16
 */

//@Controller
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello() {
        return "helloWorld";
    }
}
