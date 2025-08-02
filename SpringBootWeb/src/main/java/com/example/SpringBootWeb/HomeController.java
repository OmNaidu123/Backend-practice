package com.example.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index";
        //return "index.jsp"; before configuring prefix and suffix properties in application properties
    }
    @RequestMapping("add")
    public String add(@RequestParam("num1") int num1, @RequestParam("num2")int num2, Model model){
        int result = num1 + num2;
        model.addAttribute("result", result);
        return "result";
    }
    //WORKING WITH MODELANDVIEW OBJECT
//    @RequestMapping("add")
//    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2")int num2, ModelAndView mv){
//        int result = num1 + num2;
//        mv.addObject("result", result);
//        mv.setViewName("result");
//        return mv;
//    }
    //SERVLET WAY
//    @RequestMapping("add")
//    public String add(HttpSession session, HttpServletRequest req){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//        session.setAttribute("result", result);
//        return "result.jsp";
//    }
}
