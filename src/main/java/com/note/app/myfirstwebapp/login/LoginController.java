package com.note.app.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("login")
    public String gotoLoginPage() { //(@RequestParam String name, ModelMap model)
        // model.put("name", name);
        // logger.debug("DEBUG: Request param is {}", name);
        // logger.info("INFO: Request param is {}", name);
        // logger.warn("WARN: Request param is {}", name);
        // System.out.println("Request Param is " + name);
        return "login";

    }

}