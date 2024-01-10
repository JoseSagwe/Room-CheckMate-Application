package com.joseph.roomcheckmate.user_rest_contollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginApiController {


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

}
