package com.joseph.roomcheckmate.user_rest_contollers;

import com.joseph.roomcheckmate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/roomcheckmate")
public class RegistrationApiController {

    @Autowired
    UserService userService;

    public RegistrationApiController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/register")
    public String registration(){
        return "registration";
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

