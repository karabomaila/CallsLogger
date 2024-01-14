package org.logger.callslogger.controller;

import org.logger.callslogger.service.UserService;
import org.logger.callslogger.model.Signup;
import org.logger.callslogger.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    private UserService userService;
    public HomeController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/login")
    public String welcomePage(){
        return "home";
    }

    @GetMapping("/logout")
    public String logOutPage(){
        return "home";
    }

    @GetMapping("/signup")
    public String register(Model model){
        model.addAttribute("signup", new Signup());
        return "register";
    }

    @PostMapping("/signup")
    public String signupUser(@ModelAttribute Signup signup){
        User user = new User();
        user.setFirstName(signup.getFirstName());
        user.setLastName(signup.getLastName());
        user.setEmail(signup.getEmail());
        user.setPhoneNumber(signup.getPhoneNumber());
        user.setPassword(signup.getPassword());

        userService.save(user);

        return "redirect:logcalls";
    }
}
