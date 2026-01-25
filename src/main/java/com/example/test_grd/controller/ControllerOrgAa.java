package com.example.test_grd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerOrgAa {

    @GetMapping("org-a/hi-get")
    public String hiGet() {
        return "hi from org-a";
    }

    @GetMapping("org-a/a-number")
    public String hiGetNumber() {
        int random = (int) (Math.random() * 100);
        return "Number A : " + random;
    }
}
