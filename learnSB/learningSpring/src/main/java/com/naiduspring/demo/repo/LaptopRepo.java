package com.naiduspring.demo.repo;

import org.springframework.stereotype.Repository;

@Repository("laptopRepo1")
public class LaptopRepo implements MainRepo{
    public void save(){
        System.out.println("laptop saved in database");
    }
}
