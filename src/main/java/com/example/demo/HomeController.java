package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/private-data")
    public String privateData(){
        return  "privateData.html";
    }

    @RequestMapping("/public-data")
    public String publicData(){
        return  "publicData.html";
    }

    @RequestMapping("/loginus")
    public String login(){
        return  "loginus.html";
    }

/*
    @RequestMapping("/public-data")
    public String publicData(){
        return  "publicData.html";
    }
    /
 */
}
