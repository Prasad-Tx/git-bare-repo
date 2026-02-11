package com.example.test_grd.controller;

import com.example.test_grd.service.CommonUtilService;
import com.example.test_grd.service.GuardService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.test_grd.service.NumberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerCommon {

    @Autowired
    NumberService numberService;

    @Autowired
    GuardService guardService;

    @Autowired
    CommonUtilService commonUtilService;

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

    @GetMapping("org/add")
    public String add() {
        return String.valueOf(numberService.add(1, 2));
    }

    @GetMapping("org/guard")
    public String guard() {
        return guardService.guard() + " " + guardService.guard2();
    }

    @GetMapping("org/new-ep")
    public String newEp() {
        return "New EP";
    }

    @GetMapping("org/common-util")
    public String commonUtil() {
        String s = "Old value : ";
        return s + commonUtilService.getCommonUtil();
    }
}
