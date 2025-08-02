package com.naiduspring.demo.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("com2")
public class Laptop implements Computer {
    @Value("2")
    private int lapId;
    public int getLapId() {
        return lapId;
    }
    public void setLapId(int lapId) {
        this.lapId = lapId;
    }
    public void compile(){
        System.out.println("compiling in laptop");
    }
}
