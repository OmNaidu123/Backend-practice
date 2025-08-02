package com.naiduspring.demo.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("com1")
public class Desktop implements Computer {
    @Value("1")
    private int deskId;
    public int getDeskId() {
        return deskId;
    }
    public void setDeskId(int deskId) {
        this.deskId = deskId;
    }
    public void compile(){
        System.out.println("compiling in desktop");
    }
}
