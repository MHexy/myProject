package com.springdemo.demo.com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class IndexController {

    @RequestMapping("index")
    public String index() {
        return "index";
    }
}
