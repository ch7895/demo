package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }



    @GetMapping("/main")
    public ModelAndView main(){
        return new ModelAndView("/fragment/config");

    }
}
