package com.foodAppApi.foodAppApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


public class HomeController {
    @RequestMapping("/api")
    public String home() {
        return "Welcome to FoodApp";
    }
}
