package com.hello.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")


public class HelloWorldController{
    @RequestMapping("")
    public String says(){
        return "Hello World";
    }
}