package com.example.lomboktest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestService service;

    @GetMapping("test")
    public List<TestModel> test(){
        return service.getTest();
    }
}
