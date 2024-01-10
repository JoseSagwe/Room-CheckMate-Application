package com.joseph.roomcheckmate.user_login;

import com.joseph.roomcheckmate.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);
}
