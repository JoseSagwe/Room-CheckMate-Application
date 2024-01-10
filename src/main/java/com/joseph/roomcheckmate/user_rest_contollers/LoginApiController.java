package com.joseph.roomcheckmate.user_rest_contollers;

import com.joseph.roomcheckmate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
public class LoginApiController {

    @Autowired
    UserService userService;

    public LoginApiController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }


    @PostMapping("/login")
    public String loginUser(@RequestParam String email,
                            @RequestParam String password,
                            ModelMap model) {
        if (userService.authenticateUser(email, password)) {
            // Successful login
            return "welcomepage";
        } else {
            // Invalid credentials
            model.addAttribute("errorMessage", "Invalid email or password");
            return "login";
        }
    }


    }
