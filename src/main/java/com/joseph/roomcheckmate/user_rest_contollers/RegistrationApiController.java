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

    @PostMapping("/registerUser")
    public String registerNewUser(@RequestParam("first_name") String first_name,
                                  @RequestParam("last_name") String last_name,
                                  @RequestParam("email") String email,
                                  @RequestParam("password") String password,
                                  ModelMap model) {

//         Encrypt / Hash Password:
        String hashed_password = BCrypt.hashpw(password, BCrypt.gensalt());

        // Register New User:
        int result = userService.registerNewUserServiceMethod(first_name, last_name, email, hashed_password);

        if (result != 1) {
            model.addAttribute("message", "Registration failed");
            return "registration";
        }
        model.addAttribute("message", "Registration Successfully please Login");
        return "registration";

    }
}

