package org.logger.callslogger.controller;

import org.logger.callslogger.model.Signup;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String welcomePage(){
        return "home";
    }

    @GetMapping("/logout")
    public String logOutPage(){
        return "home";
    }

    @GetMapping("/signup")
    public String register(){
        return "register";
    }

    @PostMapping("/signup")
    public String signupUser(@RequestBody Signup signup){
        System.out.println(signup);
        return "redirect:logcalls";
    }
}
