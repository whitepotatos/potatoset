package com.example.providerfirst.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kirk")
public class CkDemoController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world！";
    }
}
