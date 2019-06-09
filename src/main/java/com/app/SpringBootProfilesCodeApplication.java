package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.app.service.impl.NotificationServiceImpl;

@SpringBootApplication
@ComponentScan
public class SpringBootProfilesCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesCodeApplication.class, args);
		
	}

}
