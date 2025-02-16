package com.techify.Docker_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping("/test-docker")
    public String getData(){
        return "Server Running";
    }

}
