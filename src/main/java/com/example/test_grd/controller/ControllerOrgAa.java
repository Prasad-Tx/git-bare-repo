package com.example.test_grd.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;

@Configuration
public class ControllerOrgAa {

    @GetMapping("org-a/hi-get")
    public String hiGet() {
        return "hi from org-a";
    }
}
