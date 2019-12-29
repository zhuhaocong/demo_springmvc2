package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestInterceptor {

    @RequestMapping("/test1")
    public ModelAndView test1(){
        System.out.println("目标方法执行...");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","张三");
        modelAndView.setViewName("jsp/success.jsp");
        return modelAndView;
    }

}
