package com.example.test_grd.controller;

import com.example.test_grd.service.GuardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerCommon {

    @Autowired
    GuardService guardService;

    @GetMapping("org/gen-number")
    public String hiGetNumber() {
        int random = (int) (Math.random() * 100);
        return "Number : " + random;
    }

    @GetMapping("org/gen-string")
    public String hiGetString() {
        int random = (int) (Math.random() * 100);
        return "Number as string : " + random;
    }

    @GetMapping("org/guard")
    public String guard() {
        return guardService.guard();
    }
}
