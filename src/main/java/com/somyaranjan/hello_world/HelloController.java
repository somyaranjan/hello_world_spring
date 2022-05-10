package com.somyaranjan.hello_world;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    
    @GetMapping("/")
    public String index(){
        return "Hello, Somya";
    }

    @RequestMapping("/start")
    public String startProcess(){
        return "index";
    }
}

