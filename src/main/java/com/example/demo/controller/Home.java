package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
public class Home {


    @GetMapping("/welcome")
    public String welcome(){
        return "hello Tushar";
    }
}
