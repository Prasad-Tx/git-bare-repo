package com.example.test_grd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerCommon {

    @GetMapping("org-a/gen-number")
    public String hiGetNumber() {
        int random = (int) (Math.random() * 100);
        return "Number : " + random;
    }

    @GetMapping("org-b/gen-string")
    public String hiGetString() {
        int random = (int) (Math.random() * 100);
        return "Number as string : " + random;
    }
}
