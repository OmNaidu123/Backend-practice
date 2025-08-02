package com.example.spring_sec_final.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String greet(){
        return "Hello";
    }
    @GetMapping("/about")
    public String about(){
        return "Om_Naidu";
    }
}
