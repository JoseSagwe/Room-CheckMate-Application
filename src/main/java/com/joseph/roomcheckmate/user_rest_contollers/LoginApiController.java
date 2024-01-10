package com.joseph.roomcheckmate.user_rest_contollers;

import com.joseph.roomcheckmate.models.Login;
import com.joseph.roomcheckmate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

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

    @PostMapping("/welcome")
    public String authenticateUser(@RequestBody Login login){
        //Get User Email
        List<String> userEmail = userService.checkUserEmail(login.getEmail());
        String hashed_password = userService.checkUserPasswordByEmail(login.getEmail());

        //Check If Email is Empty
        if(userEmail.isEmpty() || userEmail == null){
            return new ResponseEntity("Email does not exist" , HttpStatus.NOT_FOUND);
        }
        // End of Check If Email is Empty

        //Get Hashed user Password
        //Validate the user password
        if(!BCrypt.checkpw(login.getPassword(), hashed_password)){
            return new ResponseEntity("Incorrect Username Or password" , HttpStatus.BAD_REQUEST);
        }

        //Set User Object
        User user = userService.getUserDetailsByEmail(login.getEmail());
        return new ResponseEntity(user, HttpStatus.OK);
    }


}
