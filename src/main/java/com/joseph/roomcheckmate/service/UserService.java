package com.joseph.roomcheckmate.service;

import com.joseph.roomcheckmate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public int registerNewUserServiceMethod(String fname, String lname, String email, String password){
        return userRepository.registerNewUser(fname,lname,email,password);
    }  //End of Register New User

    // Check User Email Services Method
    public List<String> checkUserEmail(String email){
        return userRepository.checkUserEmail(email);
    }
    // End of Check User Email Services Method

    // Check User Password Services Method
    public String checkUserPasswordByEmail(String email){
        return userRepository.checkUserPasswordByEmail(email);
    }
    // End of Check User Password Services Method


}
