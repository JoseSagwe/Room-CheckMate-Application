package com.joseph.roomcheckmate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {

    private LoginAuthenticationService authenticationService;

    public Login(LoginAuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/welcome", method = {RequestMethod.GET, RequestMethod.POST})
    public String gotoWelcome(@RequestParam String username, @RequestParam String password, ModelMap model ){

        if(authenticationService.authenticate(username, password)) {
            model.put("username", username);
            model.put("password", password);
            return "welcomepage";
        }
        model.put("errorMessage", "Invalid Credential!! Please try again");
        return "login";
    }
}

