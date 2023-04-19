package com.raquelcodelab.onboarding2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping("/hello-servlet")
    public String hello(HttpServletRequest request) {
        request.setAttribute("nome", "Raquel");
        return "hello";
    }

    @GetMapping("/hello-model")
    public String hello(Model model){
        model.addAttribute("nome", "Yukie");
        return "hello";
    }

    @GetMapping("/hello-modelview")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("nome", "Tsuji");
        return mv;
    }
}
