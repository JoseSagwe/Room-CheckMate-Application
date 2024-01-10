package com.joseph.roomcheckmate.user_rest_contollers;

import com.joseph.roomcheckmate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/roomcheckmate")
public class RegistrationApiController {

    @Autowired
    UserService userService;
    

}
