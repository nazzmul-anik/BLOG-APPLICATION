package com.springboot.blog.repository;

import com.springboot.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByUserNameOrEmail(String username, String email);
    Optional<User> findByUserName(String username);
//    Boolean existByUserName(String username);
//    Boolean existByEmail(String email);
}
