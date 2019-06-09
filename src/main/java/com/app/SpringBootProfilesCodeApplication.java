package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.app.service.impl.NotificationServiceImpl;

@SpringBootApplication
@ComponentScan("com.app")
public class SpringBootProfilesCodeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SpringBootProfilesCodeApplication.class, args);
		String sysoString = configurableApplicationContext.getClass().getName();
		System.out.println("  sysoString "+sysoString);
		configurableApplicationContext.getBean("ab");
	}

}
