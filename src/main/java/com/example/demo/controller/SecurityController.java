package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	
	
    @GetMapping 
    public String index() {
        return "/index";
    }
	
    @GetMapping ("/test")
    public String test() {
        return "test";
    }

}
