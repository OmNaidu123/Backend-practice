package com.example.spring_sec_final.Service;

import com.example.spring_sec_final.Model.User;
import com.example.spring_sec_final.dao.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepo repo;

    public User saveUser(User user) {
        return repo.save(user) ;

    }
}
