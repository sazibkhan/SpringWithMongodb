package com.nagalay.SpringWithMongodb.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/v1/demo")
@AllArgsConstructor
public class Demo {


    @GetMapping("/")
    public String home(){
        return "Hello Bangladesh";
    }

}
