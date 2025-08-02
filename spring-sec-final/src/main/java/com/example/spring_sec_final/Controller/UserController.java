package com.example.spring_sec_final.Controller;

import com.example.spring_sec_final.Model.User;
import com.example.spring_sec_final.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("register")
    public User register(@RequestBody User user) {
        return service.saveUser(user);
    }
    @PostMapping("login")
    public String login(@RequestBody User user) {
        return "hello";
    }
}
