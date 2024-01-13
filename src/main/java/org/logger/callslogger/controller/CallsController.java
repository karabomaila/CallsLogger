package org.logger.callslogger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CallsController {

    @GetMapping("logcalls")
    public String logCall(){
        return "logcallForm";
    }
}
