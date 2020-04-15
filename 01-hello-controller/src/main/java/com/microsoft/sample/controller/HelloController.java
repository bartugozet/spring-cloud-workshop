package com.microsoft.sample.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }

}
