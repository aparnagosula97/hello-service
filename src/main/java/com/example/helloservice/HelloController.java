package com.example.helloservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("api/v1/wish")
    public String helloworld(){

        return "hello world";

    }

}
