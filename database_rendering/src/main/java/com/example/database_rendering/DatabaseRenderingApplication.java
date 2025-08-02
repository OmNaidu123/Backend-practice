package com.example.database_rendering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling  // This enables the scheduling support
public class DatabaseRenderingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseRenderingApplication.class, args);
	}

}
