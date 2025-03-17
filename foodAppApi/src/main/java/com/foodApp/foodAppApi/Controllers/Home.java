package com.foodApp.foodAppApi.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Home {
    @GetMapping("/home")
    public String home(){
        return "Welcome to FoodApp API test";
    }
}
