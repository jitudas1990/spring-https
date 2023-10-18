package com.example.springhttps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringHttps {
    @GetMapping("/getData")
    public String getMessage(){
        return "Acess https protocole";
    }
    
}
