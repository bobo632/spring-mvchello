package com.sunyx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sunyx on 2019/1/25.
 */
@Controller
public class HelloController {
    @RequestMapping("hello")
    public ModelAndView hello(String name){
        System.out.println(name);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name",name);
        modelAndView.setViewName("index.jsp");
        return modelAndView;
    }
}
