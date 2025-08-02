package com.naiduspring.demo.service;

import com.naiduspring.demo.models.*;
import com.naiduspring.demo.repo.MainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    @Qualifier("laptopRepo1")
    private MainRepo repo;
    public void addLaptop(Computer laptop){
        repo.save();
    }
}
