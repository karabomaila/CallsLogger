package org.logger.callslogger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String welcomePage(){
        return "home";
    }

    @GetMapping("/signup")
    public String register(){
        return "register";
    }
}
