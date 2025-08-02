package com.naiduspring.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mainOffice")
public class Office {
    @Value("101")
    private int roomNo;
    private Computer com;
    public Computer getCom() {
        return com;
    }
    @Autowired
    @Qualifier("com1")
    public void setCom(Computer com) {
        this.com = com;
    }
    public int getRoomNo() {
        return roomNo;
    }
    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }
    public void coding(){
        com.compile();
    }
}
