package com.foodApp.foodAppApi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodApp.foodAppApi.model.slider;

@RestController
@RequestMapping("/api")
public class homeApi {

    @GetMapping("/getslider")
    public slider getSlider() {
        return new slider("1", "slide1", "slide1 description", "slide1 link",false);
    }
    
    @GetMapping("/getsliders")
    public List<slider> getSliders() {
        List<slider> sliders = new ArrayList<>();
        sliders.add(new slider("1", "slide1", "slide1 description", "www.slide1.com", true));
        sliders.add(new slider("2", "slide2", "slide2 description", "www.slide2.com", false));
        sliders.add(new slider("3", "slide3", "slide3 description", "www.slide3.com",false));
        return sliders;
    }
}
