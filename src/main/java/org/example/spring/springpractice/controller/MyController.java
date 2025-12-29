package org.example.spring.springpractice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    @PostMapping("add")
    public String addNumbers(@RequestParam int num1, @RequestParam int num2) {
        int sum = num1 + num2;
        return "The sum of two numbers is: " + sum;


    }


}
