package com.joseph.roomcheckmate.user_rest_contollers;

import com.joseph.roomcheckmate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/roomcheckmate")
public class RegistrationApiController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity registerNewUser(@RequestParam("first_name") String first_name,
                                          @RequestParam("last_name") String last_name,
                                          @RequestParam("email") String email,
                                          @RequestParam("password") String password,
                                          ModelMap model) {

        if (first_name.isEmpty() || last_name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            model.addAttribute("errorMessage", "Please complete all fields");
            return new ResponseEntity<>(model, HttpStatus.BAD_REQUEST);
        }

        // Encrypt / Hash Password:
        String hashed_password = BCrypt.hashpw(password, BCrypt.gensalt());

        // Register New User:
        int result = userService.registerNewUserServiceMethod(first_name, last_name, email, hashed_password);

        if (result != 1) {
            model.addAttribute("errorMessage", "Registration failed");
            return new ResponseEntity<>(model, HttpStatus.BAD_REQUEST);
        }

        model.addAttribute("successMessage", "Registration successful");
        return new ResponseEntity<>(model, HttpStatus.OK);
    }
}

