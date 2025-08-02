package com.example.lomboktest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private Dao repo;

    public List<TestModel> getTest(){
        return repo.findAll();
    }
}
