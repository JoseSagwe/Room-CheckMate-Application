package com.joseph.roomcheckmate.user_login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String email,
                            @RequestParam String password,
                            ModelMap model) {
        if (loginService.authenticateUser(email, password)) {
            // Successful login
            return "welcomepage";
        } else {
            // Invalid credentials
            model.addAttribute("errorMessage", "Invalid email or password");
            return "login";
        }
    }
}
