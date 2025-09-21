package com.aws.ms_aws_eks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class GeneralController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
}
