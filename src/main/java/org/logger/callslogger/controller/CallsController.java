package org.logger.callslogger.controller;

import org.logger.callslogger.model.LogCall;
import org.logger.callslogger.service.LogCallService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CallsController {

    private LogCallService logCallService;

    public CallsController(LogCallService service){
        this.logCallService = service;
    }

    @GetMapping("/logcalls")
    public String logCall(Model model){
        model.addAttribute("logCall", new LogCall());
        return "logcallForm";
    }

    @PostMapping("/logcalls")
    public String addLogCall(Model model, @ModelAttribute LogCall logCall){
        logCallService.save(logCall);
        model.addAttribute("message", "Your call was logged. You can create a new call or view the" +
                " calls that you have created.");
        model.addAttribute("logCall", new LogCall());
        return "logcallForm";
    }
}
