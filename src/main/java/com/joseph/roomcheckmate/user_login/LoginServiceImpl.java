package com.joseph.roomcheckmate.user_login;

import com.joseph.roomcheckmate.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    private final LoginRepository loginRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public LoginServiceImpl(LoginRepository loginRepository, BCryptPasswordEncoder passwordEncoder) {
        this.loginRepository = loginRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public boolean authenticateUser(String email, String password) {
        User user = loginRepository.findByEmail(email);

        return user != null && passwordEncoder.matches(password, user.getPassword());
    }
}
