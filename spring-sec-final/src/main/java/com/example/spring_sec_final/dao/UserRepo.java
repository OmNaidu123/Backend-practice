package com.example.spring_sec_final.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring_sec_final.Model.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
