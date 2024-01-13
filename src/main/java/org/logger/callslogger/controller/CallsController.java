package org.logger.callslogger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CallsController {

    @GetMapping("logcalls")
    public String logCall(){
        return "logcallForm";
    }

    @PostMapping("logcalls")
    public String addLogCall(){
        return "logcallForm";
    }
}
