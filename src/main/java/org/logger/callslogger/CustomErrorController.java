package org.logger.callslogger;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomErrorController implements ErrorController {
    @GetMapping("/error")
    public String customError(){
        return "generalerror";
    }

    public String getErrorPath() {
        return "/error";
    }
}
