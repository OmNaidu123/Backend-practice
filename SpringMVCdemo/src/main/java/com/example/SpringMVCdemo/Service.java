package com.example.SpringMVCdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Service {
    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called");
        return "index";
    }

    @RequestMapping("login")
    public ModelAndView access(@ModelAttribute Alien user, ModelAndView mv){
        System.out.println("login method called " + user.getUser() + " " + user.getPassword());
        mv.addObject("alien",user);
        mv.setViewName("welcome");
        return mv;
    }
}
