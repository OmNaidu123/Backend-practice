package com.naiduspring.demo;

import com.naiduspring.demo.models.*;
import com.naiduspring.demo.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Laptop lap = context.getBean("com2",Laptop.class);
		LaptopService serve = context.getBean(LaptopService.class);
		serve.addLaptop(lap);
	}
}
