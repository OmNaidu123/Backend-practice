package com.example.database_rendering;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainControler {

    @MessageMapping("/newOrder")
    @SendTo("/topic/greetings")
    public Order order(Order order){
        System.out.println("controller called");
        return order;
    }
}
