package com.example.login_auth_api_kp.repositories;

import com.example.login_auth_api_kp.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(String login);
}
