package com.example.loginProject.Control;

import com.example.loginProject.models.User;
import com.example.loginProject.models.Video;
import com.example.loginProject.models.Videos;
import com.example.loginProject.repo.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class service {
    private repository repository;
    @Autowired
    public service(repository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @PostMapping("login")
    public ModelAndView login(@ModelAttribute User user, ModelAndView mv){
        Videos vidList = new Videos();
        System.out.println("entered");
        if(repository.checkIfExists(user)){
            vidList.setUrls(repository.getVids(user));
            mv.addObject("videos", vidList);
            mv.addObject("verified",user);
            mv.setViewName("welcome");
            System.out.println(vidList.toString());
        }
        else
            mv.setViewName("invalid");
        return mv;
    }

    @PostMapping("create")
    public ModelAndView newUser(@ModelAttribute User user, ModelAndView mv){
        if(repository.insert(user))
            mv.setViewName("registered");
        else
            mv.setViewName("exists");
        return mv;
    }

    @PostMapping("vidPOST")
    public ModelAndView postVideo(@ModelAttribute Video vid, ModelAndView mv){
        if(repository.insertVid(vid))
            mv.setViewName("added");
        else
            mv.setViewName("exists");
        return mv;
    }
}
